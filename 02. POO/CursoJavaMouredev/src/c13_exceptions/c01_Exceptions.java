package c13_exceptions;

public class c01_Exceptions {

    public static void main(String[] args){

        // Manejo de excepciones:

        /* TRY-CATCH:
        * - try:           Contiene el código que puede generar una excepción.
        * - catch:         Captura y gestiona la excepción para evitar que se
        *                   interrumpa el programa por ese error.
        * - Exception e:   Objeto que contiene información sobre la excepción.
        * - getMessage():  Devuelve un mensaje descriptivo del error.
        * - Continuidad:   Si la excepción se captura, el programa puede continuar
        *                   ejecutándose después del bloque try-catch.
        */
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Fin");           // Continuidad
        
        
        /* TRY CON MÚLTIPLES CATCH:
        * - try:                    Contiene el código que puede generar excepciones.
        * - ArithmeticException:    Captura errores aritméticos, como dividir por cero.
        * - NullPointerException:   Captura accesos o llamadas a métodos sobre null.
        * - Exception:              Captura otras excepciones compatibles no tratadas antes.
        * - Orden:                  Los catch más específicos deben ir primero                  <--- IMPORTANTE
        *                            y los más generales después.
        * - Ejecución:              Solo se ejecuta el primer catch compatible
        *                            con la excepción producida.
        */
        try {
            var result = 10 / 2;
            System.out.println(result);

            var name = "Jose";
            //name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Cuidado con dividir por cero: " + e.getMessage());
        } catch (NullPointerException e) {                                          // <--- Ctrl + click para ver la documentación
            System.out.println("El nombre no puede ser null: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error no esperado: " + e.getMessage());
        }

        System.out.println("Fin");           // Continuidad
        

        /* TRY-CATCH-FINALLY:
        * - try:           Contiene el código que puede generar una excepción.
        * - catch:         Captura y gestiona la excepción producida.
        * - finally:       Ejecuta código al finalizar el bloque try-catch,
        *                   tanto si se produce una excepción como si no.
        * - Finalidad:     Se utiliza habitualmente para liberar recursos,      <--- IMPORTANTE
        *                   o realizar tareas de limpieza.
        * - Continuidad:   Después de finally, el programa continúa si no
        *                   queda ninguna excepción sin gestionar.
        */
        try { 
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {                             // { Código que se ejecuta siempre, exista error o no }
            System.out.println("Fin del bloque try-catch");
        }

        System.out.println("Fin");           // Continuidad


        /* LLAMADA Y CAPTURA DE EXCEPCIONES:
        * - new ThrowExample():       Crea una instancia de la clase ThrowExample.
        * - try:                      Ejecuta los métodos que pueden lanzar excepciones.
        * - checkAge(19):             Llama al método con una edad válida.
        * - checkAge(15):             Llama al método con una edad no válida,
        *                              --> provocando el lanzamiento de una excepción.
        * - catch:                    Captura y gestiona la excepción lanzada.
        * - IllegalArgumentException: Tipo de excepción que se espera capturar.
        * - Exception e:              En este caso, la variable e contiene la excepción
        *                              IllegalArgumentException capturada.
        * - getMessage():             Obtiene el mensaje asociado a la excepción.
        * - Continuidad:              Al lanzarse una excepción, se abandona el resto
        *                              del try. Si se captura, el programa continúa
        *                              después del bloque try-catch.
        */
        var throwExample = new ThrowExample();

        try {
            throwExample.checkAge(19);
            throwExample.checkAge(15);
            // Esta parte del programa no se ejecuta, 
            // ya que se ha lanzado una excepción.
        }
        // Captura la excepción IllegalArgumentException:
        catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        //Esta parte del programa sí se ejecuta, 
        // aunque se ha lanzado una excepción dentro del try.
        System.out.println("Fin");


        /* LLAMADA Y CAPTURA DE EXCEPCIONES PERSONALIZADAS:
        * - checkScore(99):           Llama al método con una calificación valida.
        * - checkScore(109):          Llama al método con una calificación no válida,
        *                              --> provocando el lanzamiento de una excepción.
        * - catch:                    Captura y gestiona la excepción lanzada.
        * - CustomException:          Tipo de excepción que se espera capturar.
        * - Exception e:              En este caso, la variable e contiene la excepción
        *                              CustomException capturada.
        * - getMessage():             Obtiene el mensaje asociado a la excepción.
        */
        throwExample = new ThrowExample();
        try {
            throwExample.checkScore(99);
            throwExample.checkScore(109);
        }
        catch (CustomException e) {
            System.out.println("Error revisando la calificación: " + e.getMessage());
        }
    }
}
