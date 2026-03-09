# Conceptos de programación

## Frameworks
Un **framework** en programación es un es un conjunto de herramientas, bibliotecas y estructuras (reglas y buenas prácticas) predefinidas que sirven como "marco de trabajo" o estructura base para desarrollar software (páginas webs o aplicaciones) de forma más rápida, ordenada y eficiente, evitando programar todo desde cero. A diferencia de una librería, el framework dicta cómo organizar tu código. Además, **reduce errores** gracias a módulos con códigos reutilizables ya probados y **estandariza el código** para facilitar el trabajo en equipo, asegurando la coherencia entre proyectos.

Ofrece una estructura prediseñada con una serie de componentes y directrices para crear aplicaciones, esto acelera el proceso de desarrollo.
Están **diseñados para crecer**, permitiendo que tu aplicación maneje más usuarios y funcionalidades sin colapsar.

### Tipos de Frameworks

- **Frameworks de Fronted**: Se usan para construir la interfaz de usuario con la que el cliente interactúa en el navegador. Los más usados:
  - React.
  - Angular.
  - Vue.js.
- **Frameworks de Backend**: Se usan para construir la lógica del servidor, la base de datos y la API. Los más usados:
  - Django.
  - Laravel.
  - NestJS.
- **Frameworks Full-Stack**: Integran tanto el frontend como el backend en una misma solución y facilitan la comunicación entre ambas partes. Los más conocidos son:
  - Livewire.
  - Blazor.

## Seguridad
Suelen traer unas medidas de seguridad ya integradas que nos protegen de **inyecciones SQL** o **ataques XSS**[*] 

[*] Un ataque **Cross-Site Scripting (XSS)** es una vulnerabilidad de seguridad web donde un atacante inyecta scripts maliciosos (normalmente JavaScript) en sitios web legítimos. Cuando los usuarios visitan el sitio, este código se ejecuta en sus navegadores, permitiendo el robo de sesiones, datos de usuario o redirecciones maliciosas.

## Pair Programming
El **pair programming** o programación en pareja, es una técnica colaborativa en la que dos programadores trabajan juntos en un mismo código. Uno escribe mientras el otro revisa y sugiere mejoras. Es una práctica común en la industria y una herramienta efectiva para aprender programación de manera conjunta.

### Conlleva:
- Aprendizaje mutuo: Trabajar en equipo enriquece la perspectiva y habilidades.
- Detección rápida de errores: Dos pares de ojos ven más que uno.
- Mejor de la comprensión del código y la lógica detrás de cada línea.
- Desarrollo de habilidades de comunicación y colaboración esenciales para el mundo laboral.

### Se debe:
- Alternar los roles regularmente (cada 30 minutos o 1 hora):
  - **Driver (Conductor)**: Es quien escribe el código. Se enfoca en la implementación, la sintaxis y en seguir la lógica previamente acordada.
  - **Observer o Navigator (Observador)**: Es quien observa y revisa el código en tiempo real. Busca errores, verifica la lógica y sugiere mejoras, pero nunca obliga.
- Planificar antes de escribir código.
- Mantener una comunicación clara y receptiva.
- Errores comunes que se aprenderán a evitar:
  - Falta de comunicación.
  - Exceso de control.



