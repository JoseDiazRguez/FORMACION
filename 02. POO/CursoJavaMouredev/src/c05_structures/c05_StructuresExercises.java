package c05_structures;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class c05_StructuresExercises {
    public static void main(String[] args) {

        // Ejercicio 1: Crear un ArrayList de Strings y añadir 5 nombres. Imprimir el tamaño del ArrayList y los nombres.

        var names = new ArrayList<String>();    // Ordenado, permite duplicados

        names.add("Pepe");
        names.add("Díaz");
        names.add("Rodríguez");
        names.add("Vanessa");
        names.add("da Silva");

        System.out.println(names.size());
        System.out.println(names);

        // Más: Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo

        System.out.println(names.get(0));
        names.set(0,"Jose");
        System.out.println(names.get(0));

        // Más: Crea un ArrayList vacío

        var emptyList = new ArrayList<String>();
        System.out.println(emptyList);

        // Más: Añade 5 elementos y elimina el primero y el ultimo

        emptyList.add("Jose");
        emptyList.add("Díaz");
        emptyList.add("Rodríguez");
        emptyList.add("Vanessa");
        emptyList.add("da Silva");
        System.out.println(emptyList);

        emptyList.removeFirst();
        emptyList.remove(1); // Elimina el elemento en el índice 1, que es "Rodríguez"
        emptyList.removeLast();
        System.out.println(emptyList);

        // Ejercicio 2: Crear un HashSet de Strings y añadir 5 nombres. Imprimir el tamaño del HashSet y los nombres.

        var namesSet = new HashSet<String>();     // Desordenado, no permite duplicados
        namesSet.add("Jose");
        namesSet.add("Díaz");
        namesSet.add("Rodríguez");
        namesSet.add("Vanessa");
        namesSet.add("da Silva");

        System.out.println(namesSet.size());
        System.out.println(namesSet);

        // Más: Añade un valor repetido

        namesSet.add("Jose");                   // No se puede, ya que no permite duplicados
        System.out.println(namesSet.size());
        System.out.println(namesSet);

        // Más: Elimina uno de los elementos del HashSet

        namesSet.remove("Rodríguez");
        System.out.println(namesSet.size());
        System.out.println(namesSet);

        // Ejercicio 3: Crear un HashMap de Strings y añadir 5 pares de nombre y correo electrónico. Imprimir el tamaño del HashMap y los pares.

        var namesMap = new HashMap<String, String>();
        namesMap.put("Jose", "jose@email.com");
        namesMap.put("Díaz", "diaz@email.com");
        namesMap.put("Rodríguez", "rodriguez@email.com");
        namesMap.put("Vanessa", "vanessa@email.com");
        namesMap.put("da Silva", "silva@email.com");

        System.out.println(namesMap.size());
        System.out.println(namesMap);

        // Más: Modifica uno de los contactos y elimina otro

        namesMap.replace("Jose","josediazrguez@gmail.com");
        namesMap.remove("Rodríguez");

        System.out.println(namesMap.size());
        System.out.println(namesMap);

        // Ejercicio 4: Crear un ArrayList de enteros y añadir 10 números. Imprimir el tamaño del ArrayList y los números.

        var numbers = new ArrayList<Integer>();
        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers.size());
        System.out.println(numbers);

        // Ejercicio 5: Crear un HashSet de enteros y añadir 10 números. Imprimir el tamaño del HashSet y los números.

        var numbersSet = new HashSet<Integer>();

        for (int i = 1; i <= 10; i++) {
            numbersSet.add(i);
        }

        System.out.println(numbersSet.size());
        System.out.println(numbersSet);

        // Ejercicio 6: Crear un HashMap de enteros y añadir 5 pares de número y nombre. Imprimir el tamaño del HashMap y los pares.

        var numbersMap = new HashMap<Integer, String>();

        numbersMap.put(1, "Jose");
        numbersMap.put(2, "Díaz");
        numbersMap.put(3, "Rodríguez");
        numbersMap.put(4, "Vanessa");
        numbersMap.put(5, "da Silva");

        System.out.println(numbersMap.size());
        System.out.println(numbersMap);

        // Ejercicio 7: Dado un Array, transformarlo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        var numbersArray = new int[10];

        for (int i = 1; i <= 10; i++) {
            numbersArray[i - 1] = i;
        }
        // System.out.println(numbersArray); Error: De esta forma imprime la dedirección de memoria
        System.out.println(Arrays.toString(numbersArray));

        var numbersArrayList = new ArrayList<Integer>();
        for (int number : numbersArray) {
            numbersArrayList.add(number);
        }
        System.out.println(numbersArrayList);

        var numbersHashSet = new HashSet<Integer>();
        for (int number : numbersArray) {
            numbersHashSet.add(number);
        }
        System.out.println(numbersHashSet);

        var numbersHashMap = new HashMap<Integer, Integer>();
        for (int number : numbersArray) {
            numbersHashMap.put(number, number);
        }
        System.out.println(numbersHashMap);

    }
}
