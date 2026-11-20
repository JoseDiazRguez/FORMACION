package c13_exceptions;

public class InvalidPassword extends Exception{

    /* CONSTRUCTOR:
    * - Constructor:        Recibe el mensaje que describe el error.
    * - super(message):     Envía el mensaje al constructor de la clase padre.
    * - getMessage():       Permite recuperar posteriormente ese mensaje.
    */
    public InvalidPassword(String message){
        super(message);
    }
    
}
