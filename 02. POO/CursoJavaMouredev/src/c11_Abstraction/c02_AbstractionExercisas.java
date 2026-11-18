package c11_Abstraction;

import java.util.ArrayList;

public class c02_AbstractionExercisas {
    public static void main(String[] args) {
        
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
        // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
        // propia área.

        var circle = new Circle(3);
        var rectangle = new Rectangle(2,4);

        circle.calculateArea();
        rectangle.calculateArea();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa
        // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
        // diferente al ejecutarse.

        var guitar = new Guitar();
        var piano = new Piano();

        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
        // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
        // mostrar polimorfismo.

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Snoopy"));
        animals.add(new Cat("Gardfiel"));

        for (Animal animal : animals){
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
        // Triangle que muestren cómo se dibuja cada figura usando draw().

        var square = new Square();
        var triangle = new Triangle();

        circle.draw();
        square. draw();
        triangle.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary().
        // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
        // calcular el salario.

        var salary1 = new FullTimeEmployee(1200);
        var salary2 = new PartTimeEmployee(6.8,180);

        salary1.calculateSalary();
        salary2.calculateSalary();

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
        // Robot implementen ese método con comportamientos diferentes.

        var car = new Car();
        var robot = new Robot();

        car.move();
        robot.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
        // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        var tv = new TV();
        var washingMachine = new WashingMachine();

        tv.turnOn();
        tv.turnOff();

        washingMachine.turnOn();
        washingMachine.turnOff();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
        // implemente ambas interfaces y muestre cómo puede volar y nadar.

        var duck = new Duck();

        duck.swim();
        duck.fly();

        // 9. Crea una clase abstracta Document con el método print(). Luego crea
        // PDFDocument y WordDocument, cada una con su forma de imprimir.

        var pdf = new PDFDocument();
        var word = new WordDocument();

        pdf.print();
        word.print();

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las
        // clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
        // diferente.

        var invoice = new Invoice();
        var payroll = new EmployeePayment();

        invoice.pay();
        payroll.pay();

    } 
}
