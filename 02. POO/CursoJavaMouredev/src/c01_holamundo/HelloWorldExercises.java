package c01_holamundo;

import java.util.Scanner;

public class HelloWorldExercises {
    
    public static void main(String[] args) {
        
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        System.out.println("¡Hola, soy Jose!");

        // 2. Imprime dos lí­neas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada lí­nea del programa.

            // - Ya está realizado sobre cada ejercicio.

        // 4. Crea un comentario en varias lí­neas.

            /* Este es un comentario
               que se encuentra en varias lí­neas */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        int edad = 30;
        String colorFavorito = "Azul";
        String ciudad = "Madrid";

        System.out.println("Edad: " + edad);
        System.out.println("Color favorito: " + colorFavorito);
        System.out.println("Ciudad: " + ciudad);

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        System.out.println("Hola\nMundo");     // salida estándar, utilizada normalmente para mostrar información en la consola
        System.err.println("Error message");    // salida de errores, utilizada para mostrar mensajes de error
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Hola, " + nombre + "!");
        }

        // 7. Utiliza varios println para imprimir una frase.

        System.out.println("Esta es una frase.");
        System.out.println("Y esta es otra frase.");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println("    ******   ");
        System.out.println("  *        *  ");
        System.out.println(" *   O  O   * ");
        System.out.println(" *          * ");
        System.out.println(" *   \\__/   * ");
        System.out.println("  *        *  ");
        System.out.println("    ******   ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

            /* Mensaje de error que aparece al ejecutar el programa sin el método main:
               - Error: Main method not found in class HelloWorldExercises, please define the main method as:
                 public static void main(String[] args)
                 or a JavaFX application class must extend javafx.application.Application. */

        // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

            /* Mensaje de error que aparece al compilar el programa con un nombre de archivo diferente al de la clase:
               - Error: Class HelloWorldExercises is public, should be declared in a file named HelloWorldExercises.java
               - En Java, una clase pública debe tener el mismo nombre que el archivo .java donde se encuentra definida, 
                 respetando las mayúsculas y minúsculas.
               - Si no fuese pública, no habría problema en compilarla con un nombre de archivo diferente. */

    }

}
