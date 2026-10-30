package strings;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto
        String name = "Jose";                   // String es un tipo de dato no primitivo, pero se utiliza con frecuencia en Java
        System.out.println(name);

        // Con un constructor
        String surname = new String("Díaz");
        System.out.println(surname);

        // Operaciones básicas

        // Concatenar cadenas de texto
        String fullName = name + " " + surname;
        System.out.println(fullName);

        // Obtener el largo de una cadena de texto
        System.out.println(name.length());      // Al ser name un Objeto, se puede usar el punto "." para acceder a sus atributos.

    }

}