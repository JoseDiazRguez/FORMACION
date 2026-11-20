package c13_exceptions;

public class LoginSystem {

    // 10. Implementa una clase LoginSystem que use una excepción personalizada
    // LoginFailedException si el usuario o contraseña son incorrectos.

    @SuppressWarnings("unused")
    private String user;
    @SuppressWarnings("unused")
    private String password;

    /* VALIDACIÓN DE CONTRASEÑAS CON REGEX:
    * - matches():       Comprueba si un String cumple una expresión regular
    * - .*:              Permite cero o más caracteres cualesquiera
    * - [A-Z]:           Detecta letras mayúsculas de la A a la Z
    * - [a-z]:           Detecta letras minúsculas de la a a la z
    * - [0-9]:           Detecta números del 0 al 9
    * - [^a-zA-Z0-9]:    Detecta caracteres que no sean letras ASCII ni números
    * - \\s.             Detecta un espacio en blanco (espacio, tabulación, salto de línea, etc.)
    * - !:               Niega una condición lógica
    * - ||:              Operador OR; basta con que una condición sea verdadera
    * - throw:           Lanza una excepción cuando la contraseña no es válida
    */
    public LoginSystem(String user, String password) throws LoginFailedException {
        if (user != null && user.length() >= 3){
            this.user = user;
        } else {
            System.out.println("El usuario debe tener al menos 3 caracteres.");
        }
        if (password != null                                       // No (!) nulo
                && password.length() == 6                          // Contener 6 caracteres
                && password.matches(".*[A-Z].*")            // Contener al menos una letra en Mayúsculas
                && password.matches(".*[a-z].*")            // Contener al menos una letra en minúsculas
                && password.matches(".*[0-9].*")            // Contener al menos un número
                && password.matches(".*[^a-zA-Z0-9].*")     // Contener un caracter especial (ni letra, ni número)
                && !password.matches(".*\\s.*")){           // No (!) permitir espacios en blanco

            this.password = password;

        } else {
            throw new LoginFailedException("La contraseña debe tener 6 caracteres, una mayúscula, " +
                "una minúscula, un número, un carácter especial y no contener espacios en blanco.");
        }
    }
    
}
