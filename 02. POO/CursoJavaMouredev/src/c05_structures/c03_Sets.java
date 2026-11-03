package c05_structures;

import java.util.HashSet;

public class c03_Sets {
    public static void main(String[] args) {
        
        // Sets
        // Un Set es una colección que no permite elementos duplicados, sin acceso por índice (no tiene un orden específico), por lo que no se pueden modificar sus elementos.

        // Declaración y creación de Arrays:

            // - Clásica:
            HashSet<String> names = new HashSet<String>();
            // - Moderna:
            var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());
        
        // Operaciones:

        // Añadir elementos

        names.add("Jose");
        names.add("Díaz");
        names.add("Rodríguez");
        names.add("josediazrguez@gmail.com");
        System.out.println(names.size());

        // Acceder a un elemento ---> No se puede acceder a un elemento mediante un índice.

        // Note: Sets don't support index-based access. The following lines will cause compilation errors.
        // System.out.println(names.get(0));
        // System.out.println(names.getFirst());
        // System.out.println(names.get(1));
        // System.out.println(names.getLast());
        // System.out.println(names.get(names.size() - 1 ));

        System.out.println(names); // Se guardan de forma desordenada, por lo que no se puede acceder a un elemento mediante un índice.

        // Buscar un elemento --> Se busca mucho más rápido en esta estructura de datos que en un ArrayList, ya que no tiene un orden específico y no permite elementos duplicados.

        System.out.println(names.contains("Jose"));
        System.out.println(names.contains("Díaz"));
        System.out.println(names.contains("Rodríguez"));
        System.out.println(names.contains("josediazrguez@gmail.com"));

        // Eliminar un elemento

        names.remove("josediazrguez@gmail.com");
        System.out.println(names.contains("josediazrguez@gmail.com"));
        System.out.println(names);

        // Duplicados --> No se pueden añadir elementos duplicados, ya que genera el mismo hashcode (clave) y no se puede añadir a la colección.

        names.add("Jose");
        names.add("Jose");
        names.add("Jose");
        System.out.println(names);

        // Trabajo con conjuntos --> Se pueden realizar operaciones de conjuntos como unión, intersección y diferencia.

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // names.addAll(numbers);

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Brasil");
        countries.add("Marruecos");
        countries.add("Díaz");

        names.addAll(countries);        // Unión --> Se unen los conjuntos
        System.out.println(names);

        names.removeAll(countries);     // Diferencia --> Se eliminan los elementos comunes entre los conjuntos
        System.out.println(names);

        names.retainAll(countries);     // Intersección --> Se conservan los elementos comunes entre los conjuntos
        System.out.println(names);

    }
}
