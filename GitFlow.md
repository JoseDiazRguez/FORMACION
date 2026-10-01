# GitFlow

[Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) es un flujo de trabajo Git heredado que originalmente representó una estrategia innovadora y disruptiva para la gestión de ramas Git. Su popularidad ha disminuido en favor de [los flujos de trabajo basados ​​en la rama principal (trunk-based)](https://www.atlassian.com/continuous-delivery/continuous-integration/trunk-based-development) , que ahora se consideran las mejores prácticas para el desarrollo continuo de software y  las prácticas DevOps modernas . Además, Gitflow puede presentar dificultades para integrarse con CI/CD . Esta publicación ofrece información detallada sobre Gitflow con fines históricos.

> Gitflow, que se popularizó primero, es un modelo de desarrollo más estricto donde solo ciertas personas pueden aprobar los cambios en el código principal. Esto mantiene la calidad del código y minimiza la cantidad de errores. El desarrollo basado en la rama principal es un modelo más abierto, ya que todos los desarrolladores tienen acceso al código principal. Esto permite a los equipos iterar rápidamente e implementar [CI/CD](https://www.atlassian.com/continuous-delivery).


## Ramas de corrección rápida

Las ramas de mantenimiento “hotfix”se utilizan para parchear rápidamente las versiones de producción. HotfixLas ramas son muy parecidas releasea las ramas y featurelas ramas, excepto que se basan en main en lugar de develop. Esta es la única rama que debe bifurcarse directamente de main. Tan pronto como se complete la corrección, debe fusionarse tanto en main como en develop(o en la rama actual release), y main debe etiquetarse con un número de versión actualizado.

Contar con una línea de desarrollo dedicada a la corrección de errores permite que tu equipo aborde los problemas sin interrumpir el resto del flujo de trabajo ni esperar al siguiente ciclo de lanzamiento. Puedes pensar en las ramas de mantenimiento como releaseramas ad hoc que trabajan directamente con main. hotfixSe puede crear una rama utilizando los siguientes métodos:


<img width="868" height="616" alt="image" src="https://github.com/user-attachments/assets/80178906-b76d-4012-9107-e19119188ec0" />


Para instalar Git-Flow en nuestra consola:

- MacOS: 

`brew install git-flow`

- Ubuntu: 

```
sudo apt update
sudo apt install git-flow
```

Después comprueba que está instalado:

```
git flow version
```

Y ya dentro de tu repositorio:

```
git flow init
```

## Rama de producción

Which branch should be used for bringing forth production releases?
   - main
Branch name for production releases: [main]

Aquí Git Flow pregunta cuál es la rama que representa el código que está en producción o listo para producción.

En tu caso:

> main

Eso significa que main será la rama estable principal.

Normalmente:

- contiene versiones terminadas;
- no se trabaja directamente sobre ella;
- recibe cambios desde ramas release/ o hotfix/.

## Rama de desarrollo

Branch name for "next release" development: [develop]

Aquí defines la rama donde se integran los cambios de la próxima versión.

La opción habitual es:

> develop

Su función es servir como rama de integración.

El flujo típico sería:

```
feature/nueva-funcionalidad
        ↓
     develop
        ↓
release/1.0.0
        ↓
      main
```

Por tanto:

- main → versión estable / producción
- develop → próxima versión en desarrollo

## Prefijos de ramas auxiliares

Después pregunta:

How to name your supporting branch prefixes?

Es decir: cómo quieres llamar a los distintos tipos de ramas temporales.

### feature/

Feature branches? [feature/]

Se utilizan para desarrollar nuevas funcionalidades.

Ejemplos:

> feature/login
> feature/exportar-pdf
> feature/nuevo-panel

Normalmente nacen desde: develop
y al terminar vuelven a integrarse en: develop

Ejemplo:

`git flow feature start login`

Git Flow crearía:

> feature/login

### bugfix/

Bugfix branches? [bugfix/]

Se utilizan para corregir errores durante el desarrollo normal.

Ejemplos:

> bugfix/error-login
> bugfix/calculo-iva

Normalmente trabajan sobre errores de la versión que todavía está en desarrollo.
No hay que confundirlas con hotfix/, que se usa para errores urgentes en producción.

### release/

Release branches? [release/]

Se utilizan cuando una versión ya está prácticamente terminada y quieres prepararla para publicar.

Ejemplos:

> release/1.0.0
> release/2.3.0

En esta rama normalmente se hacen únicamente ajustes finales:

- corregir pequeños errores;
- actualizar versión;
- documentación;
- pruebas finales;
- preparar changelog.

No debería utilizarse para añadir grandes funcionalidades nuevas.

El flujo suele ser:

```
develop
   ↓
release/1.0.0
   ↓
main
```

y los cambios realizados en la release también se incorporan de nuevo a develop.

### hotfix/

Hotfix branches? [hotfix/]

Se utilizan para solucionar errores urgentes que ya existen en producción.

Ejemplo:

> hotfix/1.0.1

Supongamos que tienes:

> main → versión 1.0.0

y descubres un fallo crítico.

No esperarías a terminar todo lo que haya en develop.

Crearías:

```
main
 ↓
hotfix/1.0.1
```

Corriges el problema y después el hotfix se integra tanto en: main
como en: develop

Así la corrección no se pierde en futuras versiones.

### support/

Support branches? [support/]

Estas ramas se utilizan para mantener versiones antiguas durante periodos prolongados.

Por ejemplo, imagina que tienes:

> main → 3.0

pero todavía debes mantener una versión antigua: 2.x
Podrías tener: support/2.x

y seguir publicando correcciones:

- 2.1.1
- 2.1.2
- 2.1.3

mientras el desarrollo principal continúa en la versión 3.

En proyectos pequeños probablemente no la utilizarás mucho.

## Prefijo de etiquetas de versión

Version tag prefix? []

Aquí decides cómo se llamarán las etiquetas Git asociadas a cada versión.

Si lo dejas vacío:

[]

las etiquetas podrían ser:

- 1.0.0
- 1.1.0
- 2.0.0

Si introduces:
```
v
```

serán:

- v1.0.0
- v1.1.0
- v2.0.0

Esta segunda convención es muy habitual.

Por ejemplo:

> Version tag prefix? [v]

Personalmente, para documentación suele resultar más claro usar: v1.0.0
que simplemente: 1.0.0

## Resumen del modelo Git Flow

Puedes documentarlo así:

```
main
│
│  Código estable y versiones de producción
│
├── hotfix/
│     Correcciones urgentes de producción
│
└── develop
      │
      │  Desarrollo de la próxima versión
      │
      ├── feature/
      │     Nuevas funcionalidades
      │
      ├── bugfix/
      │     Correcciones durante el desarrollo
      │
      └── release/
            Preparación de una nueva versión
```

## Tabla resumida:

| Rama        | Finalidad                      | Nace normalmente de | Termina normalmente en |
|-------------|--------------------------------|---------------------|------------------------|
| `main`      | Producción                     | —                   | —                      |
| `develop`   | Desarrollo general             | `main` inicialmente | —                      |
| `feature/*` | Nueva funcionalidad            | `develop`           | `develop`              |
| `bugfix/*`  | Corregir errores en desarrollo | `develop`           | `develop`              |
| `release/*` | Preparar una versión           | `develop`           | `main` + `develop`     |
| `hotfix/*`  | Error urgente en producción    | `main`              | `main` + `develop`     |
| `support/*` | Mantener versiones antiguas    | según versión       | según estrategia       |


# Ejemplo práctico

Si quieres que lo que tienes ahora en develop pase a main y después eliminar develop, hazlo así.

Primero asegúrate de que no tienes cambios sin guardar:

```
git status
``` 

Si todo está limpio, cambia a main:

```
git switch main
``` 

Actualiza main por si GitHub tiene cambios que tú no tienes:

```
git pull origin main
```

Ahora integra develop en main:

```
git merge develop
``` 

Si no hay conflictos, sube main a GitHub:

```
git push origin main
``` 

Después puedes eliminar la rama local develop:

```
git branch -d develop
``` 

Y si también llegaste a crear/subir develop en GitHub, elimínala del remoto con:

```
git push origin --delete develop
``` 

En tu caso, por el mensaje que enseñas, parece que develop todavía no se ha subido a GitHub, porque no tiene upstream. Así que probablemente con esto bastaría:

```
git switch main
git merge develop
git push origin main
git branch -d develop
```

**Importante**: no uses git branch -D develop salvo que -d se niegue y estés seguro de que no hay commits en develop que quieras conservar. -d es la opción segura.


