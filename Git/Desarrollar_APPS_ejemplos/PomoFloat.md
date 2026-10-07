# PomoFloat — Creación inicial del proyecto

## 1. Objetivo del proyecto

**PomoFloat** será una aplicación de escritorio multiplataforma desarrollada en Python.

Objetivos principales:

- Compatible con Windows, macOS y Linux.
- Ventana flotante.
- Opción `Always on Top`.
- Ventana arrastrable.
- Ventana redimensionable.
- Recordar posición y tamaño.
- Modo normal.
- Modo ultracompacto.
- Ciclos completamente configurables.
- Fases ilimitadas.
- Repeticiones finitas o infinitas.
- Inicio automático o manual de la siguiente fase.
- Sonidos personalizados.
- Notificaciones.
- Presets.
- Temas configurables.
- Mensajes de humor opcionales.
- Minimización a bandeja del sistema.
- Inicio automático con el sistema operativo opcional.
- Proyecto Open Source.
- Publicación en GitHub.
- Uso del proyecto como práctica real de Git y GitHub.

---

# 2. Arquitectura prevista

La arquitectura inicial será:

```text
Python
    │
    ├── PySide6
    │      Interfaz gráfica
    │
    ├── Qt Multimedia
    │      Sonidos
    │
    ├── JSON
    │      Configuración inicial
    │
    ├── yt-dlp
    │      Audio externo opcional
    │
    └── PyInstaller
           Generación de ejecutables
```

La aplicación se desarrollará como aplicación de escritorio y GitHub servirá como repositorio público, documentación y sistema de distribución.

---

# 3. Crear la carpeta del proyecto

Nos situamos en la carpeta donde queremos almacenar el proyecto.

Ejemplo:

```bash
cd /mnt/c/users/josed/downloads
```

Creamos la carpeta:

```bash
mkdir PomoFloat
```

Entramos en ella:

```bash
cd PomoFloat
```

Podemos comprobar la ruta actual con:

```bash
pwd
```

Ejemplo de resultado:

```text
/mnt/c/users/josed/downloads/PomoFloat
```

---

# 4. Inicializar Git

Inicializamos un repositorio Git:

```bash
git init
```

Git crea internamente la carpeta:

```text
.git/
```

Esta carpeta contiene todo el historial, ramas y metadatos del repositorio.

---

## 4.1. Establecer `main` como rama principal

Ejecutamos:

```bash
git branch -M main
```

Esto fuerza que la rama principal se llame:

```text
main
```

Podemos comprobar el estado:

```bash
git status
```

---

# 5. Crear el entorno virtual de Python

Creamos un entorno virtual dentro del proyecto:

```bash
python3 -m venv .venv
```

Esto crea:

```text
.venv/
```

El entorno virtual permite que las dependencias de PomoFloat estén aisladas de otros proyectos Python instalados en el equipo.

---

## 5.1. Activar el entorno virtual

En Linux o WSL:

```bash
source .venv/bin/activate
```

Cuando está correctamente activado veremos algo parecido a:

```text
(.venv)
```

al comienzo del prompt.

Ejemplo:

```text
(.venv) josed@JoseDiaz ...
```

---

## 5.2. Comprobar Python

Ejecutamos:

```bash
python --version
```

Esto permite comprobar qué versión de Python está usando el entorno virtual.

---

# 6. Crear la estructura de carpetas

Creamos la estructura inicial del proyecto.

```bash
mkdir -p src/pomofloat/core
mkdir -p src/pomofloat/ui
mkdir -p src/pomofloat/services
mkdir -p src/pomofloat/config
mkdir -p src/pomofloat/utils
mkdir -p tests
mkdir -p assets/icons
mkdir -p assets/sounds
mkdir -p docs
mkdir -p .github/workflows
```

---

# 7. Crear los archivos iniciales

Creamos los archivos Python:

```bash
touch src/pomofloat/__init__.py
touch src/pomofloat/main.py

touch src/pomofloat/core/__init__.py
touch src/pomofloat/ui/__init__.py
touch src/pomofloat/services/__init__.py
touch src/pomofloat/config/__init__.py
touch src/pomofloat/utils/__init__.py
```

Creamos también los archivos generales:

```bash
touch README.md
touch CHANGELOG.md
touch LICENSE
touch .gitignore
touch pyproject.toml
touch requirements.txt
```

---

# 8. Estructura inicial del proyecto

La estructura queda aproximadamente así:

```text
PomoFloat/
│
├── .github/
│   └── workflows/
│
├── .venv/
│
├── assets/
│   ├── icons/
│   └── sounds/
│
├── docs/
│
├── src/
│   └── pomofloat/
│       │
│       ├── __init__.py
│       ├── main.py
│       │
│       ├── config/
│       │   └── __init__.py
│       │
│       ├── core/
│       │   └── __init__.py
│       │
│       ├── services/
│       │   └── __init__.py
│       │
│       ├── ui/
│       │   └── __init__.py
│       │
│       └── utils/
│           └── __init__.py
│
├── tests/
│
├── .gitignore
├── CHANGELOG.md
├── LICENSE
├── README.md
├── pyproject.toml
└── requirements.txt
```

---

# 9. Visualizar la estructura

Si tenemos instalado `tree`:

```bash
tree -a
```

Si no está instalado podemos utilizar:

```bash
find . -maxdepth 4 -type f -o -type d
```

---

# 10. Configurar `.gitignore`

Editamos el archivo:

```bash
nano .gitignore
```

Contenido inicial:

```gitignore
# Python
__pycache__/
*.py[cod]
*$py.class
*.so

# Virtual environments
.venv/
venv/
env/

# Build
build/
dist/
*.egg-info/

# PyInstaller
*.spec

# IDE
.vscode/
.idea/

# OS
.DS_Store
Thumbs.db

# Logs
*.log

# Local configuration
*.local.json

# Test/cache
.pytest_cache/
.coverage
htmlcov/
```

---

## ¿Para qué sirve `.gitignore`?

Indica a Git qué archivos o carpetas no queremos versionar.

Por ejemplo:

```text
.venv/
```

No debe subirse al repositorio porque contiene las dependencias locales de nuestro equipo.

Lo correcto será guardar las dependencias necesarias mediante la configuración del proyecto para que cada desarrollador pueda reconstruir su propio entorno.

---

# 11. Configurar `pyproject.toml`

Editamos:

```bash
nano pyproject.toml
```

Contenido:

```toml
[build-system]
requires = ["setuptools>=68", "wheel"]
build-backend = "setuptools.build_meta"

[project]
name = "pomofloat"
version = "0.1.0"
description = "Temporizador Pomodoro flotante, flexible y multiplataforma."
readme = "README.md"
requires-python = ">=3.11"
license = { text = "MIT" }

authors = [
    { name = "José Díaz Rodríguez" }
]

dependencies = []

[project.scripts]
pomofloat = "pomofloat.main:main"

[tool.setuptools.packages.find]
where = ["src"]

[tool.pytest.ini_options]
pythonpath = ["src"]
testpaths = ["tests"]
```

---

# 12. Entrada ejecutable de PomoFloat

Esta sección:

```toml
[project.scripts]
pomofloat = "pomofloat.main:main"
```
> En un archivo .toml, los comentarios se hacen con #.
> En VS Code, normalmente puedes seleccionar varias líneas y pulsar Ctrl + K, luego Ctrl + C para comentarlas; Ctrl + K, luego Ctrl + U para descomentarlas.

crea un comando:

```bash
pomofloat
```

que ejecutará la función:

```python
main()
```

que se encuentre dentro de:

```text
src/pomofloat/main.py
```

Esto evita tener que ejecutar:

```bash
python src/pomofloat/main.py
```

cada vez que queramos iniciar la aplicación.

---

# 13. Crear el primer `main.py`

Editamos:

```bash
nano src/pomofloat/main.py
```

Contenido inicial:

```python
def main() -> None:
    print("PomoFloat v0.1.0")
    print("Motor inicial preparado.")


if __name__ == "__main__":
    main()
```

Por ahora el programa únicamente verifica que la estructura y el empaquetado funcionan correctamente.

---

# 14. Instalar PomoFloat en modo editable

Con el entorno virtual activo:

```bash
pip install -e .
```

La opción:

```text
-e
```

significa:

```text
editable
```

Esto permite modificar el código fuente sin tener que reinstalar el paquete después de cada cambio.

> En caso que no permita ejecutar `pip install -e .`, porque esté bloqueando PEP 668 (en Debian/Ubuntu recientes, el Python del sistema está marcado como “gestionado externamente”, así que pip no deja instalar paquetes directamente sobre ese entorno). Entonces, la forma correcta sería utilizar un entorno virtual:
> Desde la carpeta del proyecto: `python3 -m venv .venv`
> Luego lo activamos: `source .venv/bin/activate`
> Deberíamos ver: `(.venv) <nombreUsuario> ...`
> Ahora ya podemos instalar: `pip install -e .`

---

# 15. Ejecutar PomoFloat

Probamos:

```bash
pomofloat
```

Resultado esperado:

```text
PomoFloat v0.1.0
Motor inicial preparado.
```

En nuestro caso el resultado fue:

```text
PomoFloat v0.1.0
Motor inicial preparado.
```

Por tanto, la instalación editable funciona correctamente.

---

# 16. Instalar `pytest`

Instalamos el framework de pruebas:

```bash
pip install pytest
```

Añadimos también inicialmente:

```text
pytest
```

a:

```text
requirements.txt
```

Más adelante podremos separar correctamente:

- dependencias de producción;
- dependencias de desarrollo;
- dependencias de testing.

---

# 17. Crear el README inicial

Contenido inicial de:

```text
README.md
```

```markdown
# PomoFloat

PomoFloat es un temporizador Pomodoro flotante, configurable y multiplataforma desarrollado en Python.

## Estado

Proyecto en desarrollo.

Versión actual:

`v0.1.0`

## Objetivos

- Ventana flotante.
- Always on top.
- Ciclos configurables.
- Fases ilimitadas.
- Repeticiones ilimitadas.
- Modo compacto.
- Sonidos personalizados.
- Notificaciones.
- Presets.
- Temas.
- Compatibilidad con Windows, macOS y Linux.

## Tecnología

- Python
- PySide6
- Qt
- PyInstaller

## Licencia

MIT
```

---

# 18. Comprobar el estado de Git

Ejecutamos:

```bash
git status
```

Git mostrará todos los archivos nuevos todavía no versionados.

---

# 19. Añadir los archivos al staging area

Ejecutamos:

```bash
git add .
```

El punto:

```text
.
```

significa que añadimos todos los cambios del directorio actual y sus subdirectorios.

Podemos volver a comprobar:

```bash
git status
```

Los archivos deberían aparecer ahora preparados para el commit.

---

# 20. Crear el primer commit

Ejecutamos:

```bash
git commit -m "chore: initialize PomoFloat project structure"
```

Con esto guardamos oficialmente el primer estado del proyecto en Git.

---

# 21. Conventional Commits

Vamos a utilizar una convención de mensajes de commit.

Algunos prefijos habituales:

```text
feat:
```

Nueva funcionalidad.

Ejemplo:

```text
feat: add timer pause support
```

---

```text
fix:
```

Corrección de un error.

Ejemplo:

```text
fix: prevent timer from becoming negative
```

---

```text
docs:
```

Cambios únicamente en documentación.

Ejemplo:

```text
docs: add installation instructions
```

---

```text
test:
```

Añadir o modificar pruebas.

Ejemplo:

```text
test: add phase validation tests
```

---

```text
refactor:
```

Reorganización interna del código sin cambiar funcionalidad.

Ejemplo:

```text
refactor: move timer state logic to engine
```

---

```text
chore:
```

Configuración, mantenimiento o tareas auxiliares.

Ejemplo:

```text
chore: initialize project structure
```

Nuestro primer commit utilizó:

```text
chore
```

porque todavía no se había añadido ninguna funcionalidad real.

---

# 22. Crear la rama `develop`

Desde:

```text
main
```

creamos:

```bash
git switch -c develop
```

El parámetro:

```text
-c
```

significa:

```text
create
```

Por tanto:

```bash
git switch -c develop
```

equivale conceptualmente a:

1. Crear `develop`.
2. Cambiar a `develop`.

---

# 23. Comprobar las ramas

Ejecutamos:

```bash
git branch
```

Resultado:

```text
* develop
  main
```

El asterisco:

```text
*
```

indica la rama actualmente activa.

---

# 24. Crear la primera rama de funcionalidad

No desarrollaremos directamente en:

```text
develop
```

Creamos una rama específica para el motor del temporizador:

```bash
git switch -c feature/timer-engine
```

Ahora nuestra estructura conceptual es:

```text
main
  \
   develop
      \
       feature/timer-engine
```

---

# 25. Estado actual de las ramas

Ejecutamos:

```bash
git branch
```

Actualmente tenemos:

```text
develop
* feature/timer-engine
main
```

La rama activa es:

```text
feature/timer-engine
```

---

# 26. Comprobar que Git está limpio

Ejecutamos:

```bash
git status
```

Resultado actual:

```text
On branch feature/timer-engine
nothing to commit, working tree clean
```

Esto significa que:

- estamos en `feature/timer-engine`;
- todos los cambios están guardados;
- no existen archivos modificados pendientes;
- no existen archivos preparados para commit.

---

# 27. Comprobar PomoFloat

Ejecutamos:

```bash
pomofloat
```

Resultado:

```text
PomoFloat v0.1.0
Motor inicial preparado.
```

Por tanto:

- el entorno virtual funciona;
- el proyecto está correctamente instalado;
- `pyproject.toml` funciona;
- el entry point `pomofloat` funciona;
- la estructura `src/` funciona correctamente.

---

# 28. Nota sobre `(END)` al ejecutar algunos comandos

En algunas ocasiones comandos como:

```bash
git branch
```

pueden abrir el resultado dentro del paginador de la terminal.

Puede aparecer:

```text
(END)
```

Para salir simplemente pulsamos:

```text
q
```

`q` significa:

```text
quit
```

y devuelve el control a la terminal.

---

# 29. Flujo Git que utilizaremos

El flujo del proyecto será aproximadamente:

```text
main
│
└── develop
      │
      ├── feature/timer-engine
      ├── feature/floating-window
      ├── feature/cycle-editor
      ├── feature/audio
      ├── feature/notifications
      ├── feature/themes
      ├── feature/system-tray
      └── feature/youtube-audio
```

---

## `main`

Contendrá las versiones estables y publicadas.

Por ejemplo:

```text
v0.1.0
v0.2.0
v1.0.0
```

---

## `develop`

Será la rama de integración de las funcionalidades terminadas.

Las diferentes ramas `feature/...` terminarán fusionándose aquí.

---

## `feature/...`

Cada funcionalidad se desarrollará en su propia rama.

Ejemplo:

```text
feature/timer-engine
```

Después:

```text
feature/floating-window
```

Y así sucesivamente.

---

# 30. Ejemplo del flujo de una funcionalidad

Partimos de:

```text
develop
```

Creamos:

```bash
git switch -c feature/timer-engine
```

Trabajamos en el código.

Después:

```bash
git add .
```

Creamos un commit:

```bash
git commit -m "feat: implement timer engine"
```

Cuando exista el repositorio remoto:

```bash
git push -u origin feature/timer-engine
```

Después podremos crear un Pull Request:

```text
feature/timer-engine
        ↓
     develop
```

Una vez revisado y aprobado, la funcionalidad pasa a `develop`.

---

# 31. Roadmap previsto

## v0.1.0

Base de la aplicación:

- Motor del temporizador.
- Ventana flotante.
- Always on top.
- Arrastrar.
- Redimensionar.
- Pausa.
- Reinicio.
- Saltar fase.

---

## v0.2.0

Editor de ciclos:

- Fases ilimitadas.
- Repeticiones.
- Presets.
- Inicio automático/manual.

---

## v0.3.0

Experiencia de escritorio:

- Modo ultracompacto.
- Bandeja del sistema.
- Guardar posición.
- Guardar tamaño.
- Guardar configuración.

---

## v0.4.0

Audio y notificaciones:

- Sonidos.
- Volumen.
- Notificaciones.
- Sonido diferente por fase.

---

## v0.5.0

Personalización:

- Temas.
- Mensajes humorísticos.
- Mensajes personalizados.

---

## v0.6.0

Audio externo:

- Importación mediante URL.
- Integración opcional con YouTube.
- Extracción de audio.
- Recorte del fragmento utilizado.

---

## v0.7.0

Integración con sistema operativo:

- Inicio automático opcional.
- Ajustes específicos para Windows.
- Ajustes específicos para macOS.
- Ajustes específicos para Linux.

---

## v1.0.0

Primera versión pública estable:

- GitHub Releases.
- Ejecutables.
- Documentación.
- Instalación simplificada.
- Proyecto Open Source.

---

# 32. Arquitectura futura del código

La estructura prevista crecerá hacia algo similar a:

```text
src/
└── pomofloat/
    │
    ├── main.py
    │
    ├── core/
    │   ├── timer.py
    │   ├── cycle.py
    │   └── phase.py
    │
    ├── ui/
    │   ├── main_window.py
    │   ├── compact_window.py
    │   ├── settings_window.py
    │   └── cycle_editor.py
    │
    ├── services/
    │   ├── audio.py
    │   ├── notifications.py
    │   ├── youtube.py
    │   └── startup.py
    │
    ├── config/
    │   ├── settings.py
    │   └── presets.py
    │
    └── utils/
```

---

# 33. Principio de diseño del temporizador

No programaremos PomoFloat únicamente como:

```text
25 minutos trabajo
5 minutos descanso
```

Crearemos un motor genérico basado en:

```text
Cycle
 ├── Phase
 ├── Phase
 ├── Phase
 └── ...
```

Por ejemplo:

```text
Ciclo: Mañana productiva

1. Concentración       25 min
2. Descanso             5 min
3. Concentración       25 min
4. Descanso             5 min
5. Trabajo profundo    50 min
6. Descanso largo      15 min
```

Y el ciclo podría repetirse:

```text
1 vez
2 veces
10 veces
∞
```

Esto permitirá utilizar PomoFloat para mucho más que la técnica Pomodoro tradicional.

---

# 34. Próximo paso

Estado actual:

```text
main
  \
   develop
      \
       feature/timer-engine
```

Estamos trabajando en:

```text
feature/timer-engine
```

El próximo desarrollo será crear:

```text
Phase
Cycle
TimerEngine
```

La primera versión del motor debe soportar:

- duración de fases;
- múltiples fases;
- cambio de fase;
- ciclos;
- repeticiones;
- repetición infinita;
- iniciar;
- pausar;
- reanudar;
- reiniciar;
- saltar fase;
- conocer el tiempo restante;
- conocer la fase actual.

La interfaz gráfica todavía no dependerá directamente de cómo funcione internamente el temporizador.

Esto permitirá desarrollar y probar primero la lógica y añadir posteriormente PySide6 como capa visual.

---

# Estado actual del proyecto

```bash
git status
```

Resultado:

```text
On branch feature/timer-engine
nothing to commit, working tree clean
```

Ramas:

```text
develop
* feature/timer-engine
main
```

Aplicación:

```bash
pomofloat
```

Resultado:

```text
PomoFloat v0.1.0
Motor inicial preparado.
```

**La base inicial de PomoFloat está correctamente preparada.**
