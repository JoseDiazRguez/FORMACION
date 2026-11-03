package c05_structures;

import c03_strings.Strings;
import java.util.Arrays;

public class c01_Arrays {
    public static void main(String[] args) {
     
        /*Qué son los Arrays:
         * Conjunto de datos que se almacenan en una sola variable y que se pueden acceder a ellos mediante un indice.
         */

        // Declaración y creación de Arrays

        int[] numbers = new int[3];            // Declaración de un Array con 5 elementos
        System.out.println(numbers);           // Imprimir la dirección de memoria del Array --> Ej.: [I@251a69d7
        System.out.println(numbers.length);    // Imprimir la longitud del Array
        System.out.println(numbers[0]);        // Al declararlos se inicializan a "0, 0, 0, 0, 0"
        System.out.println(numbers[1]);        // "0, 0, 0, 0, 0"
        System.out.println(numbers[2]);        // "0, 0, 0, 0, 0"
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Jose","Díaz", "Rodríguez"};      // Declaración de un Array con 3 elementos
        System.out.println(names[0]);                       // Imprimir el contenido del Array          
        System.out.println(names[1]);
        System.out.println(names[2]);


        System.out.println((new Strings[3])[0]);   // Otro modo de declarar un Array y acceder a sus elementos, de esta forma se creará "null, null, null"

        // Modificación

        numbers[0] = 1;                        // Modificar el contenido de un Array
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        // System.out.println(numbers[3]); Error

        names[2] = "josediazrguez@gmail.com";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // No puedo eliminar datos de un Array, pero los puedo poner en "null" o "0" (en int).
        names[2] = null;
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        boolean[] booleans = new boolean[3];    // Declaración de un Array con 3 elementos, se inicializan a "false, false, false"
        System.out.println(booleans[0]);        // Imprimir el contenido de un Array
        System.out.println(booleans[1]);
        System.out.println(booleans[2]);

    }

    @SuppressWarnings("unused")                         // Ver mejor más adelante
    private static void toString(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
