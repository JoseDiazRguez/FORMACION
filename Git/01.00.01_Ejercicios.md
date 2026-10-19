# PRIMEROS PASOS

## Ejercicios

1. En la terminal, muestra el directorio en el que estás ahora.
2. Cambia al directorio Documentos (o Documents) de tu sistema.
3. Vuelve al mismo directorio (Documentos o Documents), pero esta vez usando una ruta absoluta completa.
4. Sube un nivel en la jerarquía de directorios.
5. Lista el contenido del directorio actual en formato simple, luego largo y finalmente incluyendo archivos ocultos.
6. Consulta el manual de algún comando.
7. Consulta la ayuda de algún comando.
8. Muestra tu nombre de usuario, la fecha, hora actuales y el calendario de este mes.
9. Regresa al directorio donde comenzaste en el primer ejercicio.
10. Limpia la pantalla.

# GESTIÓN DE ARCHIVOS

## Ejercicios

1. Crea un directorio.
2. Elimina el directorio que acabas de crear.
3. Copia un archivo en el directorio actual y fuera de éste.
4. Mueve un archivo del directorio actual.
5. Cambia el nombre del archivo que acabas de mover.
6. Lista todos los archivos de un tipo usando un comodín.
7. Elimina un directorio de manera recursiva (cuidado con lo que vas a borrar).
8. Elimina todos los archivos de un mismo tipo (cuidado con lo que vas a borrar).
9. Utiliza el comando tree.
10. Busca un archivo concreto en el directorio actual utilizando find.

# COMANDOS AVANZADOS

## Ejercicios

1. Muestra todo el contenido de un archivo.
2. Muestra el contenido paginado de un archivo.
3. Muestra las 15 primeras líneas de un archivo.
4. Muestra las 15 últimas líneas de un archivo.
5. Busca una palabra en un archivo.
6. Cuenta las líneas de un archivo.
7. Redirige una salida y guárdala en un archivo.
8. Añade una nueva salida al archivo anterior.
9. Encadena 3 comandos.
10. Crea una variable local y muéstrala.

# EDITORES BÁSICOS

## Ejercicios

### nano

1. Crea un archivo llamado nota.txt y escribe tres líneas de texto.
2. Abre nota.txt, añade una línea al final y guarda los cambios.
3. Abre un archivo nuevo llamado recordatorio.txt, escribe algo y sal sin guardar.
4. Busca una palabra específica en un archivo existente.
5. Corta una línea y pégala en otra parte.

### vim

6. Crea apuntes.txt, entra en modo inserción y escribe una frase.
7. Mueve el cursor sin usar las flechas.
8. Borra una línea completa y deshaz el cambio.
9. Copia una línea y pégala debajo.
10. Guarda los cambios y sal.

# ADMINISTRACIÓN DEL SISTEMA

## Ejercicios

1. Crea un archivo y visualiza sus permisos.
2. Otorga permisos de ejecución sólo al propietario en modo simbólico.
3. Cambia sus permisos a 644.
4. Elimina los permisos para el grupo.
5. Haz que sólo pueda ejecutarse por el propietario.
6. Crea una carpeta y dale permisos para que sólo el usuario pueda acceder.
7. Cámbiale el propietario a otro usuario de tu sistema (si existe y tienes permisos).
8. Consulta la máscara de permisos actual y calcula qué permisos por defecto tendrán los nuevos archivos.
9. Cambia la máscara, crea un archivo y consulta los permisos por defecto del archivo.
10. Utiliza un comando como superusuario.

# PROCESOS Y ALIAS

## Ejercicios

1. Muestra todos los procesos del sistema.
2. Muestra el monitor interactivo de procesos.
3. Utiliza el comando free de manera correcta.
4. Lanza sleep 100 en la terminal, suspéndelo, mándalo al segundo plano y tráelo al primer plano.
5. Lanza un proceso como sleep y termínalo usando su PID.
6. Consulta el espacio en disco.
7. Consulta el historial.
8. Repite el último comando.
9. Crea y prueba un alias.
10. Elimina el alias que acabas de crear.

# SCRIPTING

## Ejercicios

1. Crea un script que imprima en pantalla: Hola mundo desde Bash.
2. Crea un script que muestre la fecha y el directorio actual.
3. Crea un script que guarde tu nombre en una variable y lo muestre en pantalla.
4. Crea un script que declare dos variables numéricas, las sume, reste y multiplique, mostrando el resultado de cada operación.
5. Crea un script que pida tu nombre con read y lo muestre.
6. Crea un script que pida dos números al usuario y muestre su suma.
7. Crea un script con tres argumentos que muestre el primero y el tercero.
8. Crea un script con argumentos que muestre el número total.
9. Crea un script que reciba dos números como argumentos y muestre su suma, resta, multiplicación y división.
10. Crea un script que cree un archivo de texto y guarde tu nombre en su interior.

# LÓGICA

## Ejercicios

1. Crea un script que pida un número y muestre si es positivo, negativo o cero usando if, elif y else.
2. Pide al usuario dos números y muestra cuál es mayor o si son iguales.
3. Crea un script que muestre un menú con tres opciones y ejecute la opción correspondiente según la elección del usuario.
4. Muestra todos los números del 1 al 10 usando un bucle for.
5. Crea un script que pida números al usuario hasta que introduzca el número 0. Al final, muestra cuántos números ha introducido en total.
6. Haz un script que muestre los números del 1 al 10, saltando el 5 y deteniéndose en el 8.
7. Crea una función saludar que reciba un nombre como argumento y muestre: Hola <nombre>, bienvenido al script.
8. Crea una función que reciba dos números, calcule su suma y la devuelva usando return. Muestra el resultado en el script principal.
9. Intenta copiar un archivo que no exista y muestra un mensaje de error si el comando falla, usando $? o ||.
10. Crea un script con un comentario inicial con autor, fecha, descripción y un bucle for que liste todos los archivos .sh en el directorio actual.

# CRON JOBS

## Ejercicios

1. Crea un script que muestre la fecha y hora actual en un archivo. Programa su ejecución cada minuto con una cron.
2. Crea un script que muestre "Hola desde cron" en un archivo. Configura cron para ejecutarlo cada 5 minutos.
3. Escribe un script de backup que comprima una carpeta en un archivo con fecha. Programa su ejecución cada día a las 2:00 AM.
4. Haz un script que borre archivos .log de una carpeta temporal. Programa su ejecución todos los domingos a la medianoche.
5. Programa un script que escriba la hora actual, ejecutándose cada hora de 9 a 17 (horario laboral).
6. Programa un script que muestre "Hoy toca practicar" en un archivo de log solo los lunes, miércoles y viernes a las 8:00 AM.
7. Modifica uno de los scripts para que su salida y errores se guarden en cron.log.
8. Programa un script que muestre "Sistema OK" y lo ejecute cada 10 minutos.
9. Crea un script que genere un archivo con la fecha actual. Prográmalo para ejecutarse el primer día de cada mes a medianoche.
10. Configura un script que escriba "Probando cron" en un archivo. Después, buscar información para revisar los logs del sistema y confirmar su ejecución.
