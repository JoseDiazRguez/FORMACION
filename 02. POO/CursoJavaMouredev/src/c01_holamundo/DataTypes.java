package c01_holamundo;

public class DataTypes {

    public static void main(String[] args) {

        // Dados primitivos

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java"; // String es un tipo de dato no primitivo, pero se utiliza con frecuencia en Java
        System.out.println(myString);

        /* Cómo saber el tipo de dato de una variable en compilación: Java es un lenguaje de tipado estático, 
         * lo que significa que el tipo de dato de una variable se determina en tiempo de compilación y no puede 
         * cambiar durante la ejecución del programa. Por ejemplo, si declaras una variable como int, no puedes 
         * asignarle un valor de tipo String más adelante.
         */
        System.out.println("Tipo de dato de myInt: " + ((Object)myInt).getClass().getSimpleName());
        System.out.println("Tipo de dato de myDouble: " + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("Tipo de dato de myChar: " + ((Object)myChar).getClass().getSimpleName());
        System.out.println("Tipo de dato de myBoolean: " + ((Object)myBoolean).getClass().getSimpleName());

    }

}