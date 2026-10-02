# CHERRY-PICK Y REBASE

## Cherry-pick
Permite copiar uno o varios commits concretos de otra rama a la rama actual, sin fusionar toda la rama.

Aplicar un commit:
`git cherry-pick <hash_commit>`

Cancelar el cherry-pick:
`git cherry-pick --abort`

Cherry-pick interactivo / edición del commit:
`git cherry-pick -i <hash_commit>`

Continuar después de resolver conflictos:
`git cherry-pick --continue`

### Flujo habitual
`git log --oneline` → localizar el hash  
`git switch rama-destino` → ir a la rama donde queremos copiarlo  
`git cherry-pick <hash_commit>` → aplicar el commit  

Si hay conflicto:
`git status`  
resolver archivos  
`git add .`  
`git cherry-pick --continue`

Para cancelar todo:
`git cherry-pick --abort`

---

## Rebase
Permite mover o reaplicar los commits de una rama sobre otra base, creando un historial más lineal.

Rebase sobre otra rama:
`git rebase <nombre_rama>`

Ejemplo:
`git rebase main`

Cancelar el rebase:
`git rebase --abort`

Rebase interactivo:
`git rebase -i <nombre_rama>`

Continuar después de resolver conflictos:
`git rebase --continue`

### Flujo habitual
`git switch feature/login`  
`git rebase main`

Esto reaplica los commits de `feature/login` encima del último commit de `main`.

Si hay conflicto:
`git status`  
resolver archivos  
`git add .`  
`git rebase --continue`

Para cancelar:
`git rebase --abort`

---

## Rebase interactivo
Permite modificar el historial antes de reaplicarlo:

`git rebase -i HEAD~3`

Opciones habituales:
`pick` → mantener commit  
`reword` → cambiar mensaje  
`edit` → modificar commit  
`squash` → unir con el anterior  
`fixup` → unir con el anterior descartando su mensaje  
`drop` → eliminar commit  

---

## Diferencia rápida
`cherry-pick` → copiar commits concretos entre ramas  
`rebase` → recolocar una serie de commits sobre otra rama  

⚠️ Evitar hacer `rebase` sobre commits públicos compartidos con otros usuarios, porque reescribe el historial.
