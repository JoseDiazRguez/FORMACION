package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class c02_LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        var arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);

        i = 0;
        do {
            System.out.println(arrayList.get(i));
            i++;
        } while (i < arrayList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int j = 0; j < 50; j += 5) {
            System.out.println(j);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        System.out.println("ArrayList: " + arrayList);

        int suma = 0;
        for (i = 0; i < arrayList.size(); i++) {
            suma += arrayList.get(i);
        }
        System.out.println("Suma del ArrayList = " + suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        System.out.println("ArrayList: " + arrayList);

        for (int arr : arrayList) {
            System.out.println(arr);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        // HashSet:

        var numbersSet = new HashSet<Integer>();

        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);

        System.out.println("HashSet: " + numbersSet);

        for (int set : numbersSet) {
            System.out.println(set);
        }

        // HasMap:

        var numbersMap = new HashMap<String,Integer>();

        numbersMap.put("a",1);
        numbersMap.put("b",2);
        numbersMap.put("c",3);
        numbersMap.put("d",4);
        numbersMap.put("e",5);

        System.out.println("HashMap: " + numbersMap);

        for (Map.Entry<String,Integer> map : numbersMap.entrySet()) {
            System.out.println(map.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        int[] numArray = {1,2,3,-4,5,6};

        for (int num : numArray) {
            if (num < 0) {
                break;
            } else {
                System.out.println(num);
            }
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        int valor = 5;
        int factorial = 1;

        for (i = 1; i <= valor; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + valor + " es " + factorial);

    }
}
