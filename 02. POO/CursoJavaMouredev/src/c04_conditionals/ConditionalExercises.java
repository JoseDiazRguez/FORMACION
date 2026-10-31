package c04_conditionals;

public class ConditionalExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18

        var age = 16;

        if (age >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }

        // 2. Declara dos nÃºmeros y muestra cuál es mayor, o si son iguales

        var num1 = 3;
        var num2 = 3;

        if (num1 > num2) {
            System.out.println(num1 + " es mayor.");
        } else if ( num1 == num2) {
            System.out.println("Son iguales.");
        } else {
            System.out.println(num2 + " es mayor.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero

        var num3 = 2;

        if (num3 < 0) {
            System.out.println(num3 + " es negativo.");
        } else if (num3 == 0) {
            System.out.println(num3 + " es cero.");
        } else {
            System.out.println(num3 + " es positivo.");
        }

        // 4. Crea un programa que diga si un número es par o impar

        var num4 = 6;

        if (num4 % 2 == 0) {
            System.out.println(num4 + " es par.");
        } else {
            System.out.println(num4 + " es impar.");    
        }

        // 5. Verifica si un número está en el rango de 1 a 100 --> Otra forma de hacerlo más simple

        var num5 = 43;

        if (num5 >= 0 && num5 <= 100) {
            System.out.println(num5 + " es un valor entre 0 y 100.");
        } else {
            System.out.println(num5 + " no es un valor entre 0 y 100.");    
        }

        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con switch

        var day = 6;

        switch(day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana.");
        }

        // También, más actual:

        switch(day) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No es un dia de la semana.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100)

        var note = 80;

        switch(note) {
            case 10, 20, 30, 40 -> System.out.println("Suspenso");
            case 50, 60, 70, 80 -> System.out.println("Aprobado");
            case 90, 100 -> System.out.println("Sobresaliente");
            default -> System.out.println("No es una nota.");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado

        var age2 = 13;
        var company = true;

        if (age2 >= 15 || company) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("No puedes entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // Con if:

        var letter = 'a';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " es una vocal.");
        } else {
            System.out.println(letter + " es una consonante.");
        }

        // Con switch:

        switch(letter) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letter + " es una vocal.");
            default -> System.out.println(letter + " es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres

        // Con if:

        var a = 10;
        var b = 50;
        var c = 30;

        if (a > b && a > c) {
            System.out.println("El mayor es " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es " + b);
        } else {
            System.out.println("El mayor es " + c);
        }

        // Con Math.max:

        System.out.println("El mayor es " + Math.max(a, Math.max(b, c)));

    }
}
