package c07_functions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.LongStream;

public class c02_FunctionsExercises {
    public static void main(String[] args) {

        // Ejercicio 1

        int number = 3;

        var square = squareNumber(number);
        System.out.println("El cuadrado de " + number + " es: " + square);

        // Ejercicio 2
        
        var numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        var sumNumbers = sumArray(numbers);
        System.out.println("La suma de los valores del Array es: " + sumNumbers);

        // Ejercicio 3

        var text = "Crear una función que reciba un string y devuelva el mismo string en mayúsculas";
        System.out.println(stringToUpper(text));

        // 1.

        function1();

        // 2.

        function2("Jose");

        // 3.

        int num1 = 9;
        int num2 = 3;

        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + subtractionNumbers(num1,num2));

        // 4.

        int num3 = 4;
        int num4 = 5;

        isEvenOrOdd(num3);
        isEvenOrOdd(num4);

        // 5.

        int age1 = 15;
        int age2 = 18;
        int age3 = 43;

        isAdult(age1);
        isAdult(age2);
        isAdult(age3);

        // 6.

        stringLenngth("Implementa una función que reciba una cadena y retorne su longitud.");

        // 7.

        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La media de es: " + arrayAverage(numbers2));
        System.out.println("La media de es: " + arrayAverageModern(numbers2));

        // 8.

        int num5 = -2;
        int num6 = 18;
        int num7 = 24;
        try {
            System.out.println("El factorial de " + num5 + " es: " + calculateFactorial(num5));
            System.out.println("El factorial de " + num5 + " es: " + calculateFactorialModern(num5));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("El factorial de " + num6 + " es: " + calculateFactorial(num6));
            System.out.println("El factorial de " + num6 + " es: " + calculateFactorialModern(num6));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("El factorial de " + num7 + " es: " + calculateFactorialBig(num7));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        // 9.

        var list = new ArrayList<String>();
        list.add("Manzanas");
        list.add("Naranjas");
        list.add("Peras");
        list.add("Plátanos");

        printList(list);
        printListModern(list);
        printBlockList(list);


    }

    // Ejercicio 1: Crear una función que reciba un número y devuelva su cuadrado.  
    
    public static int squareNumber(int number){
        return number*number;
    }

    // Ejercicio 2: Crear una función que reciba un array de números y devuelva la suma de todos ellos.
    
    public static int sumArray(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    // Ejercicio 3: Crear una función que reciba un string y devuelva el mismo string en mayúsculas.
    
    public static String stringToUpper(String context){
        return context.toUpperCase();
    }

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    public static void function1(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

    public static void function2(String name){
        System.out.println(name + "¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.

    public static int subtractionNumbers(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    // 4. Escribe una función que reciba un número y diga si es par o impar.

    public static void isEvenOrOdd(int number){
        if (number % 2 == 0){
            System.out.println("El número " + number + " es Par.");
        } else {
            System.out.println("El número " + number + " es Impar.");
        }
    }

    // 5. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

    public static void isAdult(int age){
        if (age < 18){
            System.out.println("Menor de edad: " + age);
        } else {
            System.out.println("Mayor de edad: " + age);
        }
    }

    // 6. Implementa una función que reciba una cadena y retorne su longitud.

    public static int stringLenngth(String text){
        System.out.println("La longitud de la cadena es: " + text.length());
        return text.length();
    }

    // 7. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

    // Función tradicional:
    public static double arrayAverage(int[] numbers){
        if (numbers == null || numbers.length == 0){
            return 0.0;
        }
        double sum = 0;
        for (double number : numbers){
            sum += number;
        }
        return sum/numbers.length;
    }

    // Función moderna:
    public static double arrayAverageModern(int[] numbers){
        return Arrays.stream(numbers)
                      .average()
                      .orElse(0.0);
    }

    // 8. Escribe un método que reciba un número y retorna su factorial.

    // Función tradicional: 
    public static long calculateFactorial(int number){
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 20.");
        }

        long result = 1;

        for (int i = number; i > 0; i--){
            result *= i;
        }

        return result;
    }

    // Función moderna:
    public static long calculateFactorialModern(int number){
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 20.");
        }

        return LongStream.rangeClosed(1, number)
                         .reduce(1, (a,b) -> a * b);
    }

    // Función para calcular factorial de números mayores de 20
    public static BigInteger calculateFactorialBig(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    // 9. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    // Función tradicional:
    public static void printList(ArrayList<String> list){
        for (String listPrint : list){
            System.out.println(listPrint);
        }
    }

    // Función moderna:
    public static void printListModern(ArrayList<String> list){
        list.forEach(System.out::println);
    }

    
    // Lista como un bloque [,,,]:
    public static void printBlockList(ArrayList<String> list){
        System.out.println("Lista: " + list);
    }

}
