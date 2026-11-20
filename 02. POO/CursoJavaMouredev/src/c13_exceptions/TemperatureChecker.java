package c13_exceptions;

public class TemperatureChecker {

    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
    // la temperatura es menor a -50 o mayor a 50.

    /* VALIDACIÓN Y LANZAMIENTO DE EXCEPCIONES:
    * - checkTemp():        Recibe una temperatura para comprobarla.
    * - throws:             Declara la excepción que puede lanzar el método.
    * - if / else if:       Comprueba si la temperatura está fuera del rango.
    * - throw:              Lanza la excepción cuando el valor no es válido.
    * - new:                Crea una instancia de la excepción personalizada.
    * - Continuidad:        Si la temperatura es válida, el método continúa
    *                        normalmente sin lanzar ninguna excepción.
    */
    public void checkTemp(double num) throws InvalidTemperatureException{

        if (num < -50){
            throw new InvalidTemperatureException(
                "La temperatura no puede ser menor que -50ºC.");
        
        } else if (num > 50) {
            throw new InvalidTemperatureException(
                "La temperatura no puede ser mayor que 50ºC.");
        
        } else {
            System.out.println("La temperatura es de: " + num + "ºC");
        }
    }
}
