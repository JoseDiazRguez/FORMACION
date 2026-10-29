package holamundo;

class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String name = "Jose";
        System.out.println(name);

        // 2. Crea una variable de tipo int y así­gnale tu edad.

        int age = 30;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.

        double height = 1.73;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean likeProgramming = true;
        System.out.println(likeProgramming);

        // 5. Declara una constante con tu email.

        final String EMAIL = "josediazrguez@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char initial ='J';
        System.out.println(initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String city = "Sevilla";
        System.out.println(city);
        city = "Estepa";
        System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println(suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println("Tipo de dato de age: " + ((Object)age).getClass().getSimpleName());
        System.out.println("Tipo de dato de height: " + ((Object)height).getClass().getSimpleName());
        System.out.println("Tipo de dato de likeProgramming: " + ((Object)likeProgramming).getClass().getSimpleName());
        System.out.println("Tipo de dato de initial: " + ((Object)initial).getClass().getSimpleName());
        System.out.println("Tipo de dato de city: " + ((Object)city).getClass().getSimpleName());
        System.out.println("Tipo de dato de a: " + ((Object)a).getClass().getSimpleName());
        System.out.println("Tipo de dato de b: " + ((Object)b).getClass().getSimpleName());
        System.out.println("Tipo de dato de name: " + ((Object)name).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        int uninitializedVariable;
        uninitializedVariable = 10;
        System.out.println(uninitializedVariable);

    }
}
