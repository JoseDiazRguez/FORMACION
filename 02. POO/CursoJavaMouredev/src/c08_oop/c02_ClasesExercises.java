package c08_oop;

import java.util.ArrayList;

public class c02_ClasesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        var book = new Book("Don Quijote de la Mancha","Miguel de Cervantes");

        book.printBook();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        var dog = new Dog("Eddie");

        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

            //- Hecho

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        var car = new Car("Peugeot","3008");

        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        var student = new Student("Jose",95);
        var student2 = new Student("Pepe",52);

        student.isApproved();
        student2.isApproved();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        var account = new BankAccount(2000.50);

        account.deposit(25.35);
        account.deposit(100.50);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        var rectangle = new Rectangle(5, 4);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        var worker = new Worker("Jose",2000);

        worker.printSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Jose",43));
        persons.add(new Person("Vanessa",45));

        for (Person person : persons){
            person.sayHello();
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

        var product = new Product("Libro A",20);

        product.priceWithDiscount(10);

    }
}
