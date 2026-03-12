Mini manual de comandos Git (Terminal)
1. Configuración inicial

Configurar usuario y correo (solo se hace una vez):

git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"

Ver configuración actual:

git config --list
2. Crear o descargar repositorios
Crear repositorio nuevo
git init

Convierte la carpeta actual en un repositorio Git.

Clonar repositorio existente
git clone URL_DEL_REPOSITORIO

Ejemplo:

git clone https://gitlab.com/proyecto/repositorio.git
3. Flujo básico de trabajo

El flujo típico en Git es:

editar archivos
↓
git add
↓
git commit
↓
git push
Ver estado del repositorio
git status

Muestra:

archivos modificados

archivos añadidos

archivos pendientes de commit

Añadir archivos al staging

Añadir un archivo:

git add archivo.txt

Añadir todos los archivos:

git add .
Crear un commit
git commit -m "Mensaje del cambio"

Ejemplo:

git commit -m "Añadida función de login"
4. Sincronizar con repositorio remoto
Descargar cambios del remoto
git fetch

Descarga cambios pero no los mezcla.

Descargar y fusionar cambios
git pull

Equivale a:

fetch + merge
Subir cambios al repositorio
git push

Ejemplo:

git push origin main
5. Trabajar con ramas (branch)
Ver ramas
git branch
Crear rama
git branch nombre-rama
Cambiar de rama
git checkout nombre-rama

o versión moderna:

git switch nombre-rama
Crear y cambiar de rama
git checkout -b nueva-rama

o

git switch -c nueva-rama
Fusionar ramas

Primero ir a la rama destino:

git checkout main

Luego:

git merge nombre-rama
6. Ver historial
Ver commits
git log

Versión resumida:

git log --oneline
Ver cambios
git diff

Comparar con último commit:

git diff HEAD
7. Deshacer cambios
Quitar archivo del staging
git restore --staged archivo.txt
Deshacer cambios de un archivo
git restore archivo.txt
Volver a un commit anterior
git reset --hard ID_COMMIT

⚠️ elimina cambios posteriores.

8. Guardar cambios temporalmente

Si tienes cambios pero no quieres hacer commit:

git stash

Recuperarlos:

git stash pop
9. Borrar archivos o moverlos

Eliminar archivo:

git rm archivo.txt

Mover o renombrar:

git mv archivo.txt nuevo.txt
10. Trabajar con repositorios remotos

Ver repositorios remotos:

git remote -v

Añadir remoto:

git remote add origin URL
Diferencia entre CMD y Git CMD
CMD (Command Prompt)

Es la terminal normal de Windows.

Características:

No tiene Git instalado por defecto

Usa comandos de Windows

Puede ejecutar Git solo si Git está en el PATH

Ejemplo:

C:\Users\jose>
Git CMD

Es una terminal que instala Git for Windows.

Ventajas:

Git ya está configurado

Incluye utilidades de Git

Maneja correctamente SSH y credenciales

Ejemplo:

C:\Program Files\Git>
Diferencia práctica
Terminal	Puede usar Git	Uso recomendado
CMD	Sí (si está en PATH)	uso general
Git CMD	Sí	mejor para Git
Git Bash	Sí	mejor experiencia (tipo Linux)

💡 Recomendación real de uso

La mayoría de desarrolladores usan:

Git Bash

porque permite comandos Linux como:

ls
pwd
clear

y Git funciona mejor.
