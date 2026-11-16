package c10_Polymorphism;

import java.util.List;
import java.util.ArrayList;

public class c02_PolymorphismExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
        // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
        // desde una lista de Animal.

            /* Implementar una Lista:
            * - List:          Quiero trabajar con una Lista.
            * - <Animal>:      Esta Lista almacenará objetos Animal o de sus subclases.
            * - animals:       Nombre de la variable que referencia la Lista.
            * - new ArrayList: Utilizará un ArrayList para almacenar los datos. De esta forma
            *                  nos permitiría añadir, eliminar y modificar elementos fácilmente
            *                  sin definir un tamaño fijo como ocurre con los arrays.
            */
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Snoopy"));
        animals.add(new Cat("Garfield"));
        animals.add(new Cow("Mootilda"));

            /* Recorrer la Lista con un for-each:
            * - Animal:         Tipo de objeto que vamos a recorrer.
            * - animal:         Variable que representa cada objeto en la iteración.
            * - animals:        Lista que que contiene los objetos que vamos a recorrer.
            * - makeSound():    Ejecuta el método correspondiente a cada objeto
            *                   según su clase (poliformismo).
            */        
        for (Animal animal : animals){
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
        // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
        // para recorrer e imprimir el Área de varias figuras.

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(4));
        shapes.add(new Rectangle(4,5));

        for (Shape shape : shapes){
            shape.calculateArea();
        }

        // 3. Crea una clase Printer con varios método print() sobrecargados que
        // acepten diferentes tipos de parámetros (String, int, double). Llama a cada
        // uno desde main.
        
        Printer.print("Imprimir esta frase");
        Printer.print(2);
        Printer.print(2.45);

        // 4. Crea una clase Greeter con dos método greet(): uno que salude con
        // "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

        Greeter.greet();
        Greeter.greet("Jose");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
        // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
        // a start() en cada uno.

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Peugeot","3008"));
        vehicles.add(new Bike("Orbea","Onna 20"));
        vehicles.add(new Truck("Volve","FH Aero"));

        for (Vehicle vehicle : vehicles){
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases
        // EmailNotification, SMSNotification. Luego crea una función
        // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        var sms = new SMSNotification();
        var email = new EmailNotification();

        sendNotification(sms);
        sendNotification(email);

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
        // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
        // su tipo con su propio getType() sobrescrito.

        var dog = new Dog("Snoopy2");
        var cat = new Cat("Garfield2");
        var horse = new Horse("Rocinante");

        showAnimalType(dog);
        showAnimalType(cat);
        showAnimalType(horse);

        // 8. Crea una clase Converter con método convert(int), convert(double), y
        // convert(String) que devuelvan diferentes formatos de texto.

        Converter converter = new Converter();

        //Polimorfismo por sobrecarga: Java elige el método convert() correspondiente según los argumentos
        var a = converter.convert(16);
        converter.check(a);
        var b = converter.convert(11.18);
        converter.check(b);
        var c = converter.convert("Hola");
        converter.check(c);

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
        // deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
        // Product e imprime el precio final de cada uno.

        var product = new Product();
        var book = new Book();
        var electronic = new Electronic();
        
        product.getPrice(1000, 20);
        book.getPrice(10);
        electronic.getPrice(100);

        // 10. Crea una clase Character con método attack(). Luego crea subclases
        // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
        // Character y llama a attack() para cada uno.

        ArrayList<Character> characters = new ArrayList<>();

        characters.add(new Warrior("Armando Bronca"));
        characters.add(new Archer("Guillermo Tell-O-Fallo"));
        characters.add(new Mage("Merli-Món"));
        
        for (Character character : characters){
            character.attack();
        }

    }


        /* Método para enviar notificaciones mediante polimorfismo:
        * - public:             Permite llamar al método desde otras clases.
        * - static:             Permite ejecutarlo sin crear una instancia de esta clase.
        * - void:               El método no devuelve ningún valor.
        * - sendNotification:   Nombre del método.
        * - Notification:       Tipo del parámetro. Permite recibir objetos de Notification
        *                           o de cualquiera de sus subclases (SMSNotification, EmailNotification).
        * - n:                  Variable que recibe la referencia al objeto pasado como argumento.
        * - n.send():           Ejecuta el método send() del objeto recibido. Gracias al
        *                           polimorfismo, Java selecciona la implementación correspondiente
        *                           a la clase real del objeto.
        */
    public static void sendNotification(Notification n) {
        n.send();
    }

    public static void showAnimalType(Animal a){
        a.getType();
    }

}
