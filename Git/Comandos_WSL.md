# WSL (sistema de Linux dentro de Windows)

Hay que tener en cuenta que WSL monta los discos dentro de /mnt, entonces:
```
C:\      → /mnt/c
D:\      → /mnt/d
```
La carpeta de Desktop de Windows sería:
```
cd /mnt/c/Users/josed/Desktop
```
## Otro truco muy práctico

Añade un alias para no escribir la ruta larga.
Edita tu configuración:
```
nano ~/.zshrc
```
Añade al final:
```
alias winhome="cd /mnt/c/Users/josed"
alias desktop="cd /mnt/c/Users/josed/Desktop"
```
Recarga:
```
source ~/.zshrc
```
Ahora puedes hacer:
```
desktop
```
y te lleva al escritorio.
