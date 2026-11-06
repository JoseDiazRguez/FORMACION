package c08_oop;

public class Person {
    
    // Atributos
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Funciones o Métodos dentro de una clase
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
}
