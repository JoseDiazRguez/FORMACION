# GitFlow

[Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) es un flujo de trabajo Git heredado que originalmente representó una estrategia innovadora y disruptiva para la gestión de ramas Git. Su popularidad ha disminuido en favor de [los flujos de trabajo basados ​​en la rama principal (trunk-based)](https://www.atlassian.com/continuous-delivery/continuous-integration/trunk-based-development) , que ahora se consideran las mejores prácticas para el desarrollo continuo de software y  las prácticas DevOps modernas . Además, Gitflow puede presentar dificultades para integrarse con CI/CD . Esta publicación ofrece información detallada sobre Gitflow con fines históricos.

> Gitflow, que se popularizó primero, es un modelo de desarrollo más estricto donde solo ciertas personas pueden aprobar los cambios en el código principal. Esto mantiene la calidad del código y minimiza la cantidad de errores. El desarrollo basado en la rama principal es un modelo más abierto, ya que todos los desarrolladores tienen acceso al código principal. Esto permite a los equipos iterar rápidamente e implementar [CI/CD](https://www.atlassian.com/continuous-delivery).


## Ramas de corrección rápida

Las ramas de mantenimiento “hotfix”se utilizan para parchear rápidamente las versiones de producción. HotfixLas ramas son muy parecidas releasea las ramas y featurelas ramas, excepto que se basan en main en lugar de develop. Esta es la única rama que debe bifurcarse directamente de main. Tan pronto como se complete la corrección, debe fusionarse tanto en main como en develop(o en la rama actual release), y main debe etiquetarse con un número de versión actualizado.

Contar con una línea de desarrollo dedicada a la corrección de errores permite que tu equipo aborde los problemas sin interrumpir el resto del flujo de trabajo ni esperar al siguiente ciclo de lanzamiento. Puedes pensar en las ramas de mantenimiento como releaseramas ad hoc que trabajan directamente con main. hotfixSe puede crear una rama utilizando los siguientes métodos:

![](https://dam-cdn.atl.orangelogic.com/AssetLink/t8b1bnptx6bn40wc43g83j02u5b61064.svg)
