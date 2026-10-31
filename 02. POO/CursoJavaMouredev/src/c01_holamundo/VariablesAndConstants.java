package c01_holamundo;

public class VariablesAndConstants {
    
    public static void main(String[] args) {

        // Variables
        int myInt = 10;                     // Enteros
        double myDouble = 5.99;             // Números de punto flotante
        char myChar = 'D';                  // Carácteres                   --> Entrecomillado simple
        String myText = "Hello World!";     // Cadenas de texto             --> Entrecomillado

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("String: " + myText);

        // Changing variable values
        myText = "Changed Text";
            /*
            * myText = 123; // This line would cause an error because myText is a String variable
            */
        System.out.println("Changed String: " + myText);

        var myVar = 20;                     // Variable con tipo inferido
        System.out.println("Var: " + myVar);
            /*
            *myVar = "hola"; // Cambiando el tipo de la variable var a String
            * Esto causará un error porque myVar fue inferido como un entero
            */

        // Constants
        final String EMAIL = "josediazrguez@gmail.com"; // Constant          --> Mayúscula y con guiones bajos para separar palabras
        System.out.println("Email: " + EMAIL);

    }
}