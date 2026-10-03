# Git — Comandos avanzados de consulta y mantenimiento

## 1. `git blame <archivo>`

Muestra quién modificó por última vez cada línea de un archivo y en qué commit se realizó ese cambio.

```bash
git blame archivo.py
```

La salida suele incluir:

- hash del commit;
- autor;
- fecha;
- número de línea;
- contenido de la línea.

Es especialmente útil para investigar el origen de un cambio concreto o entender cómo ha evolucionado una parte del código.

Ejemplo:

```bash
git blame README.md
```

También puede limitarse a un rango de líneas:

```bash
git blame -L 20,40 archivo.py
```

---

## 2. `git revert <commit>`

Crea un nuevo commit que deshace los cambios introducidos por un commit anterior.

```bash
git revert <hash_commit>
```

Ejemplo:

```bash
git revert 4ff9bb8
```

A diferencia de `git reset`, **no elimina ni reescribe el historial**. El commit original permanece y se añade otro commit que aplica los cambios inversos.

Es una opción especialmente segura cuando el commit ya ha sido compartido o subido a un repositorio remoto.

Flujo conceptual:

```text
Commit A
   ↓
Commit B
   ↓
Commit C
   ↓
Revert de B
```

El historial permanece intacto.

---

## 3. `git archive`

Genera un archivo comprimido con el contenido del repositorio en un commit o referencia determinada.

Ejemplo ZIP:

```bash
git archive --format=zip --output=proyecto.zip HEAD
```

Esto genera:

```text
proyecto.zip
```

con el contenido actual de `HEAD`.

Por defecto, no incluye el directorio interno:

```text
.git/
```

Por tanto, es útil para:

- distribuir una versión del proyecto;
- entregar código fuente;
- generar una copia limpia;
- empaquetar una release.

También puede generarse desde una rama o tag:

```bash
git archive --format=zip --output=v1.0.zip v1.0
```

---

## 4. `git clean -fd`

Elimina archivos y directorios no rastreados por Git.

```bash
git clean -fd
```

Opciones:

```text
-f → fuerza la eliminación
-d → incluye directorios
```

Es útil para limpiar archivos generados por:

- compilaciones;
- pruebas;
- procesos automáticos;
- archivos temporales.

Antes de eliminar nada, es recomendable comprobar qué se borraría:

```bash
git clean -nd
```

`-n` realiza una simulación y no elimina archivos.

> ⚠️ `git clean -fd` elimina archivos físicamente y Git no puede recuperarlos si nunca fueron versionados.

Los archivos incluidos en `.gitignore` normalmente no se eliminan con este comando.

---

## 5. `git diff --staged`

Muestra las diferencias de los archivos que ya se encuentran en el área de staging.

```bash
git diff --staged
```

También puede utilizarse:

```bash
git diff --cached
```

Ambos muestran prácticamente lo mismo:

```text
Cambios incluidos con git add
        ↓
Área de staging
        ↓
Próximo commit
```

Es especialmente útil antes de ejecutar:

```bash
git commit
```

para comprobar exactamente qué cambios van a formar parte del commit.

Comparación:

```bash
git diff
```

muestra cambios todavía no añadidos al staging.

```bash
git diff --staged
```

muestra cambios ya preparados para el commit.

---

## 6. `git log --follow <archivo>`

Muestra el historial de commits de un archivo específico.

```bash
git log --follow archivo.py
```

La opción:

```text
--follow
```

permite continuar siguiendo el historial incluso cuando el archivo ha sido renombrado.

Ejemplo:

```bash
git log --follow README.md
```

Es útil para investigar:

- cuándo apareció un archivo;
- quién lo modificó;
- qué commits lo afectaron;
- si cambió de nombre;
- cómo evolucionó a lo largo del proyecto.

Para verlo de forma compacta:

```bash
git log --follow --oneline archivo.py
```

---

## 7. `git show <commit>:<archivo>`

Permite consultar cómo era un archivo exactamente en un commit determinado.

```bash
git show <hash_commit>:ruta/archivo
```

Ejemplo:

```bash
git show 4ff9bb8:README.md
```

Git mostrará el contenido de `README.md` tal y como existía en ese commit.

También puede utilizarse con ramas o tags:

```bash
git show main:README.md
```

```bash
git show v1.0:README.md
```

Es útil para consultar versiones anteriores sin modificar el estado actual del repositorio.

---

## 8. `git log --grep=<expresión>`

Busca commits cuyo mensaje contiene una expresión determinada.

```bash
git log --grep="login"
```

Ejemplo:

```bash
git log --grep="error"
```

Permite localizar commits por palabras clave incluidas en sus mensajes.

También puede combinarse con formato compacto:

```bash
git log --oneline --grep="login"
```

Ejemplo de resultado:

```text
d94c31a Corrige error de login
82af312 Añade formulario de login
```

Es especialmente útil cuando el repositorio tiene muchos commits.

---

## 9. `git shortlog`

Agrupa los commits por autor y muestra un resumen de contribuciones.

```bash
git shortlog
```

Una variante especialmente útil es:

```bash
git shortlog -sn
```

Opciones:

```text
-s → muestra únicamente el número de commits
-n → ordena por número de commits
```

Ejemplo:

```text
120  Ana
84   José
32   Carlos
```

Para incluir todas las referencias:

```bash
git shortlog -sn --all
```

Es útil para obtener una visión rápida de quién ha contribuido al repositorio y cuántos commits tiene cada autor.

---

## 10. `git bisect`

Permite localizar qué commit introdujo un error mediante una búsqueda binaria entre commits.

Proceso básico:

```bash
git bisect start
```

Se marca el estado actual o un commit con el error:

```bash
git bisect bad
```

Después se indica un commit antiguo conocido como correcto:

```bash
git bisect good <hash_commit>
```

Ejemplo:

```bash
git bisect good a12bc34
```

Git irá seleccionando automáticamente commits intermedios.

En cada uno se comprueba si el error existe:

```bash
git bisect good
```

o:

```bash
git bisect bad
```

Git continúa reduciendo el rango hasta identificar el commit que introdujo el problema.

Al terminar:

```bash
git bisect reset
```

Esquema:

```text
Commit bueno ---------------- Commit malo
      ↓
          Git prueba un punto intermedio
                    ↓
              good / bad
                    ↓
          reduce el rango de búsqueda
                    ↓
           commit responsable
```

`git bisect` resulta especialmente útil cuando existen muchos commits entre la última versión conocida como correcta y la versión en la que aparece el error.

---

# Chuleta rápida

| Comando | Función |
|---|---|
| `git blame <archivo>` | Saber quién modificó cada línea |
| `git revert <commit>` | Deshacer un commit sin borrar historial |
| `git archive` | Generar una copia limpia/comprimida del proyecto |
| `git clean -fd` | Eliminar archivos y directorios no rastreados |
| `git diff --staged` | Ver cambios preparados para commit |
| `git log --follow <archivo>` | Consultar el historial completo de un archivo |
| `git show <commit>:<archivo>` | Ver un archivo como era en otro commit |
| `git log --grep="texto"` | Buscar commits por mensaje |
| `git shortlog -sn` | Resumir commits por autor |
| `git bisect` | Encontrar qué commit introdujo un error |

