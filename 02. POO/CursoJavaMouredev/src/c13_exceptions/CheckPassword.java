package c13_exceptions;

public class CheckPassword {



    public void checkPassword(String pass) throws InvalidPassword{
        if (pass.length() < 6) {
            throw new InvalidPassword("Contraseña incorrecta: Debe tener al menos 6 caracteres.");
        } else {
            System.out.println("Contraseña correcta.");
        }
    }
    
}
