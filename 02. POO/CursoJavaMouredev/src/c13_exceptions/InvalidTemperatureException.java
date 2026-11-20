package c13_exceptions;

/* EXCEPCIÓN PERSONALIZADA:
* - extends Exception:  Crea una excepción personalizada heredando de Exception.
*/
public class InvalidTemperatureException extends Exception{

    /* CONSTRUCTOR:
    * - Constructor:        Recibe el mensaje que describe el error.
    * - super(message):     Envía el mensaje al constructor de la clase padre.
    * - getMessage():       Permite recuperar posteriormente ese mensaje.
    */
    public InvalidTemperatureException(String message){
        super(message);
    }
    
}
