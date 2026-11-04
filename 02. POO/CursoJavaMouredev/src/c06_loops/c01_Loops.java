package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class c01_Loops { 
    public static void main(String[] args) {

        // Loops
        /*
        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        System.out.println("Hola, Java!");
        */

        // for

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, Java!");
        }

        // for en una estructura de datos               --> Forma más clásicaº

        String[] names = {"Jose", "Díaz", "Rodríguez", "Vanessa", "da Silva"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for-each                                     --> Forma más moderna y legible

        for (String name : names) {                     // for-each: Recorre cada elemento de names y lo asigna a la variable name
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();                 // Con HashSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int number : numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();           // Con HashMap
        emails.put("Jose", "josediazrguez@gmail.com");
        emails.put("Vanessa", "vanessa@gmail.com");

        for (Map.Entry<String,String> email : emails.entrySet()) {
            System.out.println("Nombre: " + email.getKey() + ", Email: " + email.getValue());
        }

        // while                                        --> Repetimos mientras se cumpla una condición

        int i = 0;
        while (i < 5) {
            System.out.println("Hola, Java!");
            i++;
        }

        i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        i = 0;
        Boolean find = false;
        while (!find && i < names.length) {
            System.out.println(names[i]);
            if (names[i].equals("Díaz")) {
                find = true;                            // Indicamos que hemos encontrado el elemento
            }
            i++;
        }

        // do-while                                     --> Repetimos hasta que se cumpla una condición

        i = 0;
        do {                                            // Se ejecuta al menos una vez, y luego se repite mientras se cumpla la condición
            System.out.println("Hola, Java!");
            i++;
        } while (i < 5);

        // Control de bucle: break y continue

        // break: rompe el bucle y sale de él

        for (String name : names) {
            if (name.equals("Rodríguez")) {
                break;                                  // Rompe el bucle y sale de él
            }
            System.out.println(name);
        }

        // continue: salta a la siguiente iteración del bucle

        for (String name : names) {
            if (name.equals("Rodríguez")) {
                continue;                               // Salta a la siguiente iteración del bucle
            }
            System.out.println(name);
        }

        for (i = 0; i < 5; i++) {
            if (i == 2) {
                continue;                               // Salta a la siguiente iteración del bucle
            }
            System.out.println(i);
        }

        // Control de bucle: label

        bucle2: for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 2 && k == 2) {
                    break bucle2;                       // Rompe el bucle externo y sale de él
                }
                System.out.println("j: " + j + ", k: " + k);
            }
        }

    }
}
