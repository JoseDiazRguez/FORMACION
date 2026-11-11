package c09_Inheritance;

import java.util.ArrayList;

public class c01_InheritanceExercises {
    public static void main(String[] args) {
     
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
        // que herede de Vehicle y agrega el método honk().

        var car = new Car("Peugeot","3008");

        car.honk();
        car.move();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase
        // Student que agregue el atributo grade y un método study().

        var student = new Student("Jose",43,"Ingeniería Informática");

        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y
        // Cat diga "Meow" sobrescribiendo ese método.

        var dog = new Dog("Snoopy");
        var cat = new Cat("Garfield");

        dog.makeSound();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
        // Employee y agrega el atributo department.

        var manager = new Manager("Jose", 2500,"Ingeniería");

        manager.showManager();

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego
        // implementa ese método en Circle y Rectangle.

        var circle = new Circle(6);
        var rectangle = new Rectangle(4,5);

        circle.calculateArea();
        rectangle.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
        // fly() pero también llame al método original con super.fly().

        var eagle = new Eagle("Arvid");

        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima "Device created".
        // Luego crea Phone que herede de Device y en su constructor imprima "Phone
        // ready".

        @SuppressWarnings("unused")
        var phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw().
        // SavingsAccount hereda y agrega un método addInterest().

        var salvings = new SavingsAccount(2000,5);

        salvings.addInterest();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
        // un método describe() sobrescrito.

        var bike = new Bike("Orbea","Onna 20");
        var truck = new Truck("Volve","FH Aero");

        car.describe();
        bike.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().

        var bird = new Bird("Piolín");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        for (Animal animal : animals){
            animal.makeSound();
        }

    }
}
