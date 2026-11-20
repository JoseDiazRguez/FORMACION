package c13_exceptions;

public class ThrowExample {

    /* DECLARACIÓN Y LANZAMIENTO DE EXCEPCIONES:
    * - checkAge(int age):        Método que recibe una edad para comprobarla.
    * - throws:                   Declara que el método puede lanzar una excepción.
    *                             --> Es opcional para IllegalArgumentException.
    * - IllegalArgumentException: Excepción que indica que un argumento recibido
    *                             no cumple las condiciones exigidas.
    * - if (age < 18):            Comprueba si la edad es inferior a 18 años.
    * - throw:                    Lanza manualmente una excepción al cumplirse
    *                             la condición indicada.
    * - new IllegalArgumentException:
    *                             Crea la excepción con un mensaje descriptivo.
    * - Interrupción:             Al ejecutar throw, finaliza inmediatamente
    *                             la ejecución normal del método.
    * - Propagación:              La excepción se transmite al método que llamó
    *                             a checkAge(), donde puede capturarse con catch.
    */
    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Lanza la excepción IllegalArgumentException:
            throw new IllegalArgumentException("Tienes que ser mayor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
    }

    /* DECLARACIÓN Y LANZAMIENTO DE EXCEPCIONES PERSONALIZADAS:
    * - checkScore(int score):    Método que recibe una calificación para comprobarla.
    * - throws:                   Declara que el método puede lanzar una excepción.
    *                             --> Es opcional para CustomException.
    * - CustomException:          Excepción personalizada.
    * - if (score < 0 || score > 100): Comprueba si la calificación es inferior
    *                                 a 0 o superior a 100.
    * - throw:                    Lanza manualmente una excepción al cumplirse
    *                             la condición indicada.
    * - new CustomException:      Crea la excepción con un mensaje descriptivo.
    */
    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("Mi excepción personalizada: ");
        } else {
            System.out.println("Calificación válida: " + score + ".");
        }
    }
}
