package operadores;

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int a;
        
        
        a = 5 + 3;
        System.out.println("Suma: " + a);
        a = 5 - 3;
        System.out.println("Resta: " + a);
        a = 5 * 3;
        System.out.println("Multiplicación: " + a);
        a = 5 / 3;
        System.out.println("División: " + a);
        a = 5 % 3;
        System.out.println("Resto: " + a);

        // 2. Crea una variable para cada tipo de operación de asignación.

        int b = 3;

        a = b;
        System.out.println("Asignación: " + a);
        a = a * 2;
        System.out.println("Asignación: " + a);
        a += 1;
        System.out.println("Asignación: " + a);
        a -= 1;
        System.out.println("Asignación: " + a);
        a *= 2;
        System.out.println("Asignación: " + a);
        a /= 2;
        System.out.println("Asignación: " + a);
        a %= 2;
        System.out.println("Asignación: " + a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Desigualdad: " + (a != b));
        System.out.println("a Menor que b: " + (a < b));
        System.out.println("a Menor o igual que b: " + (a <= b));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println("Igualdad: " + (a == b));
        System.out.println("a Mayor que b: " + (a > b));
        System.out.println("a Mayor o igual que b: " + (a >= b));

        // 5. Utiliza el operador lógico and.

        System.out.println("(a != b) && (a < b): " + ((a != b) && (a < b)));
        System.out.println("(a == b) && (a < b): " + ((a == b) && (a < b)));

        // 6. Utiliza el operador lógico or.

        System.out.println("(a != b) || (a < b): " + ((a != b) || (a < b)));
        System.out.println("(a == b) || (a > b): " + ((a == b) || (a > b)));

        // 7. Combina ambos operadores lógicos.

        System.out.println("(a != b) && (a < b) || (a == b) && (a > b): " + ((a != b) && (a < b) || (a == b) && (a > b)));

        // 8. Añade alguna negación.

        System.out.println("!(a != b) && (a < b) || (a == b) && (a > b): " + (!(a != b) && (a < b) || (a == b) && (a > b)));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println("a = " + a);
        System.out.println("a++: " + (a++));
        System.out.println("a = " + a);
        System.out.println("++a: " + (++a));
        System.out.println("a = " + a);
        System.out.println("a--: " + a--);
        System.out.println("a = " + a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println("(a != b) && ((a + b) < b) || (a == (b - a)) && (a > b) && (a != b): " 
            + ((a != b) && ((a + b) < b) || (a == (b - a)) && (a > b) && (a != b)));

    }
}
