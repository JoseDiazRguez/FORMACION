package c05_structures;

import java.util.ArrayList;

public class c02_List {
    public static void main(String[] args) {

        // Declaración y creación de Arrays:

            // - Clásica:
            ArrayList<String> names = new ArrayList<String>();
            // - Moderna:
            var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());


        // Operaciones:

        // Añadir elementos

        names.add("Pepe");
        names.add("Díaz");
        names.add("Rodríguez");
        System.out.println(names.size());

        // Acceder a un elemento

        System.out.println(names.get(0));
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());
        System.out.println(names.get(names.size() - 1 ));

        // Modificar un elemento

        names.set(0, "Jose");
        System.out.println(names.get(0));

        // Eliminar un elemento

        names.remove(2);
        // System.out.println(names.get(2)); // Error, ya que el elemento 2 ha sido eliminado);
        System.out.println(names.get(names.size() -1));
        System.out.println(names.size());

        // Buscar un elemento

        System.out.println(names.contains("Díaz"));
        System.out.println(names.contains("Pepe"));

        // Borrar todos los elementos

        names.clear();
        System.out.println(names.size());

    }
}
