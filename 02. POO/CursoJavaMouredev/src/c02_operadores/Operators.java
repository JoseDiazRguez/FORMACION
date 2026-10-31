package c02_operadores;

public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritméticos

        var a = 5;
        var b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Resto: " + (a % b));

        System.out.println("\n");

        // Asignación

        a = b;
        System.out.println("Asignación: " + a);
        a = b * 2;
        System.out.println("Asignación: " + a);
        a += 1; // Igual que a = a + 1
        System.out.println("Asignación: " + a);
        a -= 1; // Igual que a = a - 1
        System.out.println("Asignación: " + a);
        a *= 2; // Igual que a = a * 2
        System.out.println("Asignación: " + a);
        a /= 2; // Igual que a = a / 2
        System.out.println("Asignación: " + a);
        a %= 5; // Igual que a = a % 5
        System.out.println("Asignación: " + a);

        System.out.println("\n");

        // Comparación (Relacionales -->  ==, !=, >, <, >=, <= )

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("Igualdad: " + (a == b));
        System.out.println("Desigualdad: " + (a != b));
        System.out.println("a Mayor que b: " + (a > b));
        System.out.println("a Menor que b: " + (a < b));
        System.out.println("a Mayor o igual que b: " + (a >= b));
        System.out.println("a Menor o igual que b: " + (a <= b));

        System.out.println("\n");

        // Lógicos ( &&, ||, ! )
        
            /* Tablas de verdad:
            * &&: 
            * 0 && 0 = 0
            * 0 && 1 = 0
            * 1 && 0 = 0
            * 1 && 1 = 1
            * 
            * ||
            * 0 || 0 = 0
            * 0 || 1 = 1
            * 1 || 0 = 1
            * 1 || 1 = 1
            * 
            * !
            * !0 = 1
            * !1 = 0
            */

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("a Mayor que b y a Menor que 10: " + (a > b && a < 10));
        System.out.println("a Mayor que b o a Menor que 10: " + (a > b || a < 10));
        System.out.println("a Mayor que b y a Menor que 10: " + (!(a > b) && a < 10)); // Principio de asociación ()
        System.out.println("a Mayor que b: " + (a > b));
        System.out.println("No a Mayor que b: " + !(a > b));

        System.out.println("\n");

        // Unarios

        System.out.println("a = " + (+a));
        System.out.println("- a = " + (-a));
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++)); // Cambio de valor y se muestra en el siguiente println
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // Cambio de valor y se muestra en este println
        System.out.println("a = " + a);
        System.out.println("a-- = " + (a--));  // Cambio de valor y se muestra en el siguiente println
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a)); // Cambio de valor y se muestra en este println
        System.out.println("a = " + a);

        System.out.println("\n");

    }
}