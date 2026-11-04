package c05_structures;

import java.util.HashMap;

public class c04_Maps {
    public static void main(String[] args) {

        // Declaración y creación de Maps <Key, Value>: --> con Hash --> Se añaden desordenados igual que los Sets

            // - Clásica:
            HashMap<String, String> names = new HashMap<String, String>();  // nombre --> mail
            // - Moderna:
            var numbers = new HashMap<Integer, String>();                   // teléfono --> nombre

        // Tamaño

        System.out.println(names.size());
        System.out.println(numbers.size());

        // Operaciones:

        // Añadir elementos

        names.put("Jose", "josediazrguez@gmail.com");
        names.put("Díaz", "diazrguez@gmail.com");
        names.put("Rodríguez", "rodriguez@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a un elemento --> Puedo acceder mediante la clave (Key) y me devuelve el valor (Value)

        System.out.println(names.get("Jose"));
        System.out.println(names.get("Díaz"));
        System.out.println(names.get("Rodríguez"));
        System.out.println(names.get("NoExiste")); // Devuelve "null" porque no existe la clave (Key) en el Map

        // Verificar elementos --> Puedo buscar mediante la clave (Key) y me devuelve el valor (Value) 
        //                         y también puedo buscar mediante el valor (Value) y me devuelve un booleano

        System.out.println(names.containsKey("Jose"));
        System.out.println(names.containsValue("josediazrguez@gmail.com"));

        // Eliminar un elemento --> Puedo eliminar mediante la clave (Key), nos devuelve el valor (Value), 
        //                          y eliminar mediante la clave y valor (Key, Value) y me devuelve un booleano

        System.out.println(names);
        System.out.println(names.remove("Díaz"));
        System.out.println(names.remove("Jose", "josediazrguez@gmail.com"));
        System.out.println(names);

        // Limpiar el Map

        names.clear();
        System.out.println(names);

        // Otras operaciones:

        // Modificar un elemento --> Puedo modificar mediante la clave (Key) y me devuelve el valor (Value)

        names.put("Díaz", "diazrguez@gmail.com");
        System.out.println(names.get("Díaz"));

        names.put("Díaz", "nuevodiazrguez@gmail.com");
        System.out.println(names.get("Díaz"));

        names.replace("Jose", "josediazrguez@gmail.com");                   // Modificar solo si existe la clave (Key) en el Map

        names.putIfAbsent("Jose", "josediazrguez@gmail.com");               // Modificar solo si no existe la clave (Key) en el Map

        names.isEmpty();                                                    // Devuelve un booleano si el Map está vacío o no

        var values = names.keySet();                                        // Devuelve un Set con las claves (Key) del Map
        System.out.println(values);                                         
        
        names.values();                                                     // Devuelve un Set con los valores (Value) del Map

    }   
}