# Mini Manual de Comandos Git (Terminal)

Guía rápida de los comandos más utilizados de Git para trabajar desde terminal.

---

# 1. Configuración inicial

Configurar usuario y correo (solo se hace una vez):

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
```

Ver configuración actual:

```bash
git config --list
```

---

# 2. Crear o descargar repositorios

## Crear repositorio nuevo

```bash
git init
```

Convierte la carpeta actual en un repositorio Git.

---

## Clonar repositorio existente

```bash
git clone URL_DEL_REPOSITORIO
```

Ejemplo:

```bash
git clone https://gitlab.com/proyecto/repositorio.git
```

---

# 3. Flujo básico de trabajo

Flujo típico en Git:

```
editar archivos
↓
git add
↓
git commit
↓
git push
```

---

## Ver estado del repositorio

```bash
git status
```

Muestra:

- archivos modificados
- archivos añadidos
- archivos pendientes de commit

---

## Añadir archivos al staging

Añadir un archivo:

```bash
git add archivo.txt
```

Añadir todos los archivos:

```bash
git add .
```

---

## Crear un commit

```bash
git commit -m "Mensaje del cambio"
```

Ejemplo:

```bash
git commit -m "Añadida función de login"
```

---

# 4. Sincronizar con repositorio remoto

## Descargar cambios del remoto

```bash
git fetch
```

Descarga cambios pero no los mezcla con tu código.

---

## Descargar y fusionar cambios

```bash
git pull
```

Equivale a:

```
fetch + merge
```

---

## Subir cambios al repositorio

```bash
git push
```

Ejemplo:

```bash
git push origin main
```

---

# 5. Trabajar con ramas (branch)

## Ver ramas

```bash
git branch
```

---

## Crear rama

```bash
git branch nombre-rama
```

---

## Cambiar de rama

```bash
git checkout nombre-rama
```

o versión moderna:

```bash
git switch nombre-rama
```

---

## Crear y cambiar de rama

```bash
git checkout -b nueva-rama
```

o

```bash
git switch -c nueva-rama
```

---

## Fusionar ramas

Primero ir a la rama destino:

```bash
git checkout main
```

Luego:

```bash
git merge nombre-rama
```

---

# 6. Ver historial

## Ver commits

```bash
git log
```

Versión resumida:

```bash
git log --oneline
```

---

## Ver cambios

```bash
git diff
```

Comparar con último commit:

```bash
git diff HEAD
```

---

# 7. Deshacer cambios

## Quitar archivo del staging

```bash
git restore --staged archivo.txt
```

---

## Deshacer cambios de un archivo

```bash
git restore archivo.txt
```

---

## Volver a un commit anterior

```bash
git reset --hard ID_COMMIT
```

⚠️ Elimina cambios posteriores.

---

# 8. Guardar cambios temporalmente

Guardar cambios sin hacer commit:

```bash
git stash
```

Recuperarlos:

```bash
git stash pop
```

---

# 9. Borrar archivos o moverlos

Eliminar archivo:

```bash
git rm archivo.txt
```

Mover o renombrar:

```bash
git mv archivo.txt nuevo.txt
```

---

# 10. Trabajar con repositorios remotos

Ver repositorios remotos:

```bash
git remote -v
```

Añadir remoto:

```bash
git remote add origin URL
```

---

# Diferencia entre CMD y Git CMD

## CMD (Command Prompt)

Terminal estándar de Windows.

Características:

- No incluye Git por defecto
- Usa comandos nativos de Windows
- Puede ejecutar Git si está en el PATH

Ejemplo:

```
C:\Users\usuario>
```

---

## Git CMD

Terminal instalada con **Git for Windows**.

Ventajas:

- Git ya configurado
- Incluye herramientas Git
- Maneja credenciales y SSH correctamente

---

## Comparación

| Terminal | Puede usar Git | Uso recomendado |
|--------|--------|--------|
| CMD | Sí (si está en PATH) | Uso general |
| Git CMD | Sí | Mejor para Git |
| Git Bash | Sí | Mejor experiencia tipo Linux |

---

💡 Recomendación: usar **Git Bash** para trabajar con Git desde terminal.
