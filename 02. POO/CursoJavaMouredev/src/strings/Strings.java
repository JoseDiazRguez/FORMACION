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

        // Obtener un carácter de una cadena de texto
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(name.length() - 1));

        // Obtener una subcadena de una cadena de texto  --> OJO: Excluye el carácter final
        System.out.println(name.substring(0));                      // Devuelve la cadena completa
        System.out.println(name.substring(0, 4));          // Devuelve los primeros cuatro caracteres
        System.out.println(name.substring(0, name.length()));       // Devuelve la cadena completa

        // Convertir una cadena de texto a mayúsculas o minúsculas
        System.out.println(name.toUpperCase());                                 // Devuelve la cadena en mayúsculas
        System.out.println(name.toLowerCase());                                 // Devuelve la cadena en minúsculas

        // Buscar una subcadena en una cadena de texto
        System.out.println(name.contains("se"));                              // Devuelve true o false --> true
        System.out.println(name.contains("Se"));                              // Devuelve true o false --> false
        System.out.println("Hola, Jose".contains("se"));                      // Devuelve true o false --> true
        System.out.println("Hola, Jose".toUpperCase().contains("se"));        // Devuelve true o false --> false -- Se pueden concatenar operaciones
        System.out.println("Hola, Jose".toUpperCase().contains("SE"));        // Devuelve true o false --> true  -- Se pueden concatenar operaciones

        // Comparar dos cadenas de texto
        System.out.println("Jose".equals("Jose"));                     // Devuelve true o false --> true
        System.out.println("Jose".equals("jose"));                     // Devuelve true o false --> false
        System.out.println("Jose".equalsIgnoreCase("jose"));      // Devuelve true o false --> true    -- Ignora la diferencia entre mayúsculas y minúsculas

        // == vs equals()   --> Buenas prácticas: Usar siempre equals()
        var a = "Jose";
        var b = "Jose";
        var c = new String("Jose");
        System.out.println(a == b);                                              // Devuelve true o false --> true    -- Compara la referencia
        System.out.println(a == c);                                              // Devuelve true o false --> false   -- Compara la referencia
        System.out.println(a.equals(b));                                         // Devuelve true o false --> true    -- Compara el contenido
        System.out.println(a.equals(c));                                         // Devuelve true o false --> true    -- Compara el contenido
        
        // Eliminar espacios en blanco al inicio y al final de una cadena de texto
        System.out.println("   Hola, Jose   ".trim());                           // Devuelve la cadena sin espacios en blanco

        // Reemplazar una subcadena en una cadena de texto
        System.out.println(name.replace("o", "a"));          // Devuelve la cadena con la letra "o" reemplazada por la letra "a"
        System.out.println("Hola, Jose".replace("o", "a"));  // Devuelve la cadena con la letra "o" reemplazada por la letra "a"
        System.out.println("Hola, Jose".replace("o", "a").replace("a", "e"));   // Devuelve la cadena con la letra "o" reemplazada por la letra "e"

        // Formatear una cadena de texto
        System.out.println(String.format("Hola, %s %s", "Jose", surname));   // Devuelve la cadena formateada

        // Dividir una cadena de texto en una lista de cadenas de texto
        System.out.println("Hola, Jose".split(", "));                                 // Devuelve su dirección en memoria, no el contenido
        System.out.println(java.util.Arrays.toString("Hola, Jose".split(", ")));      // Devuelve la lista de cadenas de texto
    
    }
}