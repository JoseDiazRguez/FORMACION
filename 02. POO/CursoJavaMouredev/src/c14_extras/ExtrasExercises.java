package c14_extras;

/* IMPORTACIÓN DE CLASES:
 * - import:        Permite utilizar clases de otros paquetes.
 * - Scanner:       Clase que permite leer datos introducidos por teclado.
 * - Random:        Clase que permite generar números pseudoaleatorios.
 * - java.util:     Paquete de Java que contiene diversas clases de utilidad.
 */
import java.util.Scanner;
import java.util.Random;

public class ExtrasExercises {

    /* VARIABLE DE CLASE (STATIC):
     * - static:        Indica que el atributo pertenece a la clase y no
     *                  a cada instancia u objeto.
     * - message:       Nombre del atributo de clase.
     * - String:        Tipo de dato utilizado para almacenar texto.
     * - Ámbito:        Puede utilizarse desde los métodos de la clase.
     * - Visibilidad:   Al no tener modificador de acceso, es accesible
     *                  desde otras clases del mismo paquete.
     */
    static String message = "Variable global.";

    public static void main(String[] args) {

        /* CONSTANTES (FINAL):
         * - final:         Impide reasignar el valor de una variable.
         * - MAX_SCORE:     Nombre de la constante, escrito en mayúsculas.
         * - int:           Tipo de dato entero.
         * - Ámbito:        Variable local, accesible únicamente dentro de main().
         */
        final int MAX_SCORE = 100;

        // 1. Crea una variable de tipo String inicializada como null y verifica que no
        // esté vacía antes de usarla.

        /* COMPROBACIÓN DE VALORES NULL:
         * - String:        Tipo de referencia utilizado para almacenar texto.
         * - null:          Indica que la variable no referencia ningún objeto.
         * - name != null:  Comprueba que la variable no sea null.
         * - if:            Ejecuta el código si la condición es verdadera.
         * - else:          Ejecuta el código si la condición es falsa.
         * - Prevención:    Evita utilizar métodos sobre una referencia null,
         *                  lo que provocaría una NullPointerException.
         */
        String name = null;

        if (name != null){
            System.out.println("El nombre es: " + name);
        } else {
            System.out.println("El nombre es null.");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.

        /* ENTRADA DE DATOS CON SCANNER:
         * - Scanner:           Permite leer información introducida por teclado.
         * - new Scanner():     Crea una instancia de la clase Scanner.
         * - System.in:         Entrada estándar del programa.
         * - scanner:           Variable que referencia el objeto Scanner.
         * - nextLine():        Lee una línea completa de texto.
         * - nextInt():         Lee un número entero.
         * - var:               Permite que Java infiera el tipo de la variable.
         * - println():         Muestra información por consola.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        var name2 = scanner.nextLine();

        System.out.println("Introduce tu edad: ");
        var age2 = scanner.nextInt();

        System.out.println(name2 + " tiene " + age2 + " años.");

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.

        /* UTILIZACIÓN DE CONSTANTES:
         * - MAX_SCORE:     Constante declarada al comienzo de main().
         * - final:         Impide modificar su valor una vez asignado.
         * - println():     Muestra el valor de la constante por consola.
         * - Ventaja:       Evita modificaciones accidentales de valores fijos.
         */
        System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método
        // main(). Muestra ambas.

        /* SCOPE (ÁMBITO DE LAS VARIABLES):
         * - Scope:                 Determina desde dónde puede accederse
         *                          a una variable.
         * - Variable local:        Se declara dentro de un método o bloque.
         * - Atributo de clase:     Se declara dentro de la clase, fuera de los métodos.
         * - static:                Indica que el atributo pertenece a la clase.
         * - message:               Accede a la variable local de main().
         * - ExtrasExercises.message:
         *                          Accede al atributo static de la clase.
         * - Ocultación (Shadowing): La variable local oculta al atributo
         *                          cuando ambos tienen el mismo nombre.
         */
        String message = "variable local.";

        System.out.println(message);
        System.out.println(ExtrasExercises.message);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo
        // o negativo.

        /* LECTURA Y COMPARACIÓN DE NÚMEROS:
         * - nextInt():       Lee un número entero introducido por teclado.
         * - number5:         Variable local que almacena el número recibido.
         * - if:              Comprueba si se cumple una condición.
         * - <:               Operador de comparación "menor que".
         * - >:               Operador de comparación "mayor que".
         * - else if:         Comprueba una condición alternativa.
         * - else:            Se ejecuta cuando las condiciones anteriores
         *                    son falsas.
         * - Importante:      El cero no es positivo ni negativo.
         */
        System.out.println("Introduce un número: ");
        var number5 = scanner.nextInt();

        if (number5 < 0){
            System.out.println("El número " + number5 + " es negativo.");
        } else if (number5 > 0) {
            System.out.println("El número " + number5 + " es positivo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin
        // crear un objeto.

        /* ACCESO A ATRIBUTOS STATIC:
         * - static:                 El atributo pertenece a la clase.
         * - ExtrasExercises:        Nombre de la clase que contiene el atributo.
         * - message:               Atributo static que queremos consultar.
         * - ExtrasExercises.message:
         *                          Accede directamente al atributo de clase.
         * - Instanciación:         No es necesario crear un objeto con new.
         * - Sintaxis:              NombreClase.nombreAtributo.
         */
        System.out.println(ExtrasExercises.message);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.

        /* GENERACIÓN DE NÚMEROS ALEATORIOS:
         * - Random:         Clase que genera números pseudoaleatorios.
         * - new Random():   Crea una instancia de Random.
         * - rand:           Variable que referencia el generador.
         * - nextInt(10):    Genera un entero desde 0 hasta 9 (ambos incluidos).
         * - + 1:            Desplaza el rango para obtener valores del 1 al 10.
         * - number7:        Variable que almacena el número generado.
         */
        Random rand = new Random();
        int number7 = rand.nextInt(10) + 1;

        System.out.println("Número random: " + number7);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del
        // código.

        /* DOCUMENTACIÓN DEL CÓDIGO:
         * - //:           Comentario de una sola línea.
         * - Bloque:       Los comentarios entre /* y * / permiten escribir
         *                 explicaciones de varias líneas (sin el espacio).
         * - Javadoc:      Utiliza comentarios que comienzan con /** para
         *                 documentar clases, métodos y otros elementos.
         * - Finalidad:    Explicar qué hace el código y por qué se utiliza.
         * - Legibilidad:  Facilita la comprensión y el mantenimiento.
         * - Compilación:  Los comentarios no se ejecutan ni afectan a la
         *                 lógica del programa.
         * - Buena práctica:
         *                 Evitar comentarios redundantes y documentar
         *                 especialmente decisiones o comportamientos relevantes.
         */

        // 9. Define una clase User con una constante APP_NAME, una variable global
        // username y una función que imprima ambas.

        /* ACCESO A MÉTODOS STATIC DE OTRA CLASE:
         * - User:           Clase que contiene el método showUser().
         * - showUser():     Método que muestra los datos definidos en User.
         * - static:         Permite llamar al método sin crear una instancia.
         * - User.showUser(): Ejecuta el método utilizando el nombre de su clase.
         * - Instanciación:  No es necesario utilizar new User().
         * - Visibilidad:    El método debe ser accesible desde esta clase.
         */
        User.showUser();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes
        // herramientas.

        /* DEBUG (DEPURACIÓN):
         * - Debugger:       Herramienta para analizar la ejecución del programa.
         * - Breakpoint:     Punto de interrupción que pausa la ejecución.
         * - Step Over:      Ejecuta la siguiente instrucción sin entrar
         *                   en los métodos llamados.
         * - Step Into:      Entra en el método llamado para analizarlo.
         * - Step Out:       Continúa hasta salir del método actual.
         * - Variables:      Permite consultar los valores durante la ejecución.
         * - Watch:          Permite supervisar variables o expresiones.
         * - Call Stack:     Muestra la secuencia de llamadas a métodos.
         * - Continue:       Reanuda la ejecución hasta el siguiente breakpoint.
         * - Finalidad:      Detectar errores y comprender el flujo del programa.
         */

        /* CIERRE DE RECURSOS:
         * - scanner.close():  Cierra el Scanner.
         * - System.in:        También se cierra la entrada estándar asociada.
         * - Recomendación:    Cerrar el Scanner cuando ya no se necesite leer
         *                     más información.
         */
        scanner.close();

    }

}