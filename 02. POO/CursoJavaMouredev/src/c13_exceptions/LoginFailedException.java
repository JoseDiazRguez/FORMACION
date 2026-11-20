package c13_exceptions;

public class LoginFailedException extends Exception{

    // 10. Implementa una clase LoginSystem que use una excepción personalizada
    // LoginFailedException si el usuario o contraseña son incorrectos.

    public LoginFailedException(String message){
        super(message);
    }
    
}
