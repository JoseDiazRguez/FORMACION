package strings;

public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.

        String name = "Jose";
        String surname = "Díaz";
        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(name.length());
    
        // 3. Muestra el primer y último carácter de un string.

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() -1));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
         
        System.out.println(name.contains("se"));

        // 6. Formatea un string con un entero.

        int age = 43;
        System.out.println(String.format("Tengo %d años", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println("   Hola, Jose   ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println("   Hola, Jose   ".replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.

        System.out.println("Jose".equals(name));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println("Luis".length() == name.length());

    }
}
