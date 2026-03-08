# Git

Heramienta que guarda el historial completo de los cambios en el código. 
Nos permite revisar el progreso y recuperar versiones anteriores cuando sea necesario.
Almacena diferentes versiones del código con el paso del tiempo, cada una representa un estado específico (instantánea), con ello podremos comparar el código, los cambios, colaborar con otras personas.

## Restaración
Se puede **restaurar a una versión anterior sin perder el trabajo reciente** [...ver cómo se hace esto...] 

## Trabajo colaborativo
Trabajando de forma colaborativa, **cada uno en una rama**, cuando llegue el momento se pueden **combinar y organizar** de manera segura [...ver cómo se hace esto...] 

## Conceptos:
- **Repositorio (repo)**: Es el proyecto en sí, donde Git guarda todos los archivos, cambios e historial del proyecto.
- **Commit**: Fotografía instantánea del proyecto en un momento específico, guardando todos los cambios realizados hasta ese momento y permitiéndonos volver a ese punto si es necesario.
- **Branchs (ramas)**: Es una especie de línea separada de desarrollo donde podemos trabajar en una nueva característica o solución sin afectar a la rama principal (main). Luego podremos combinar diferentes ramas, fusionarlas o reintegrarlas con el resto del proyecto.
- **Merch**: Sirve para combinar cambios realizados en diferentes ramas.

## Ciclo de vida de una rama
1. **Creación**: Creas una rama nueva a partir de main (ej. feature/nueva-pantalla).
2. **Trabajo**: Haces commits en esa rama. La rama principal queda intacta.
3. **Fusión (Merge)**: Cuando la característica está terminada y probada, fusionas feature/nueva-pantalla con main.
4. **Limpieza**: Borras la rama feature/nueva-pantalla ya que no la necesitas más. 

