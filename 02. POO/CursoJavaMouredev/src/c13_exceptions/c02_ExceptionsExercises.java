package c13_exceptions;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class c02_ExceptionsExercises {
    @SuppressWarnings("null")

    public static void main(String[] args) {

        /* SCANNER Y EXCEPCIONES DE ENTRADA:
        * - Scanner:           Permite leer datos introducidos por teclado.
        * - System.in:         Entrada estándar del programa.
        * - try (...):         Declara un recurso que Java cerrará automáticamente.
        * - AutoCloseable:     Interfaz que permite el cierre automático de recursos.
        * - scanner.close():   No es necesario llamarlo manualmente.
        * - Ventaja:           Evita fugas de recursos y garantiza su cierre
        *                       al abandonar el bloque, en condiciones normales.
        */
        try (Scanner scanner = new Scanner(System.in)) {

            // 1. Divide dos números almacenados en dos variables. Maneja la división por
            // cero con try-catch.

            int num1 = 10;
            int num2 = 0;

            try {
                var result = num1 / num2;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el
            // ArrayIndexOutOfBoundsException.

            int[] elements = new int[3];

            try {
                System.out.println(elements[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error de rango: " + e.getMessage());
            }

            // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
            // NullPointerException.

            String text = null;

            try {
                System.out.println(text.length());
            } catch (NullPointerException e){
                System.out.println("Error variable nula: " + e.getMessage());
            }
            
            // 4. Escribe una función que transforma texto a número. Usa try-catch para
            // manejar entradas no válidas (NumberFormatException).

            try{
                int number1 = textToNumber("25");
                System.out.println(number1);
                int number2 = textToNumber("Hola");
                System.out.println(number2);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el texto a número: " + e.getMessage());
            }

            // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o
            // no error.

                /* TRY-CATCH-FINALLY CON MÚLTIPLES EXCEPCIONES:
                * - try:                    Ejecuta el código que puede generar excepciones.
                * - scanner.nextDouble():   Solicita y lee un número decimal introducido por teclado.
                * - if (number2 == 0):      Comprueba si el divisor es cero.
                * - throw:                  Lanza manualmente una excepción si se cumple la condición.
                * - ArithmeticException:    Excepción utilizada para impedir la división entre cero.
                * - InputMismatchException: Captura errores cuando el usuario introduce un dato
                *                            incompatible con el tipo esperado (por ejemplo, letras).
                * - catch:                  Captura y gestiona cada excepción de forma específica.
                * - getMessage():           Recupera el mensaje asociado a la excepción.
                * - finally:                Ejecuta su código tanto si hay una excepción como si no.
                * - Continuidad:            El programa continúa después del bloque si no queda
                *                            ninguna excepción sin gestionar.
                */
            try {
                System.out.println("Introduce el dividendo: ");
                double number1 = scanner.nextDouble();

                System.out.println("Introduce el divisor: ");
                double number2 = scanner.nextDouble();

                if (number2 == 0){
                    throw new ArithmeticException("No se puede dividir entre 0.");
                }

                double result = number1 / number2;
                System.out.printf("La división da de resultado: %.2f\n", result);

            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un número válido.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Fin");
            }

            // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
            // es negativo.

            try {
                System.out.println("Introduce un número entero positivo mayor que cero: ");
                int number3 = scanner.nextInt();
                
                var calculator = new SquareRoot();              // Como pow2() no es static, necesitas crear una instancia de Pow
                double result2 = calculator.sqrt(number3);      // para poder llamarlo desde el main() de otra clase.
                System.out.printf("Su raiz cuadrada es: %.2f\n", result2);        

            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
            // la temperatura es menor a -50 o mayor a 50.

            var temp = 30;

                /* CAPTURA DE EXCEPCIONES PERSONALIZADAS:
                * - new TemperatureChecker():  Crea el objeto que valida temperaturas.
                * - try:                       Ejecuta el método que puede lanzar la excepción.
                * - checker.checkTemp(temp):   Envía la temperatura para comprobarla.
                * - catch:                     Captura la excepción personalizada.
                * - getMessage():              Recupera el mensaje de error.
                * - Continuidad:               Si la excepción se captura, el programa
                *                               puede continuar después del try-catch.
                */
            var checker = new TemperatureChecker();

            try {
                checker.checkTemp(temp);
            } catch (InvalidTemperatureException e){
                System.out.println("Error: " + e.getMessage());
            }

            // 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
            // otro para ArrayIndexOutOfBoundsException.

            int[] numbers = new int[10];
            Random rand = new Random();

            for (int i = 0; i < numbers.length; i++){
                numbers[i] = rand.nextInt(4);
            }

            System.out.println(Arrays.toString(numbers));

            try {
                int number4 = numbers[rand.nextInt(20)];
                System.out.println(number4);
                int number5 = numbers[rand.nextInt(3)];
                System.out.println(number5);
                
                int result = number4 / number5;
                System.out.println("La división entre " + number4 + " y " + number5 + " es igual a: " + result);

            } catch (ArithmeticException a) {
                System.out.println("Error de división entre 0: " + a.getMessage());
            } catch (ArrayIndexOutOfBoundsException b) {
                System.out.println("Error de rango: " + b.getMessage());
            }

                /* Ejemplos reales:
                *
                * 1) ArithmeticException:
                * [0, 1, 0, 3, 1, 0, 0, 1, 0, 3]
                * 0
                * 0
                * Error de división entre 0: / by zero
                * 
                * 2) ArrayIndexOutOfBoundsException:
                * [0, 0, 1, 1, 1, 2, 2, 0, 1, 2]
                * Error de rango: Index 15 out of bounds for length 10
                * */

            // 9. Crea una función checkPassword(String pass) que lance una excepción si la
            // contraseña es demasiado corta.

            System.out.println("Introduce una contraseña de al menos 6 caracteres: ");

            scanner.nextLine();     // Consume antes el salto de línea pendiente.
            var pass = scanner.nextLine();

            var passScanner = new CheckPassword();

            try {
                passScanner.checkPassword(pass);
            } catch (InvalidPassword e) {
                System.out.println("Error: " + e.getMessage());
            }        

            // 10. Implementa una clase LoginSystem que use una excepción personalizada
            // LoginFailedException si el usuario o contraseña son incorrectos.

            System.out.println("Introduce un usuario: ");
            var user = scanner.nextLine();

            System.out.println("Introduce una contraseña: ");
            var password = scanner.nextLine();

            try {
                new LoginSystem(user, password);
                System.out.println("Login correcto.");

            } catch (LoginFailedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static int textToNumber(String text){
        return Integer.parseInt(text);
    }

}
