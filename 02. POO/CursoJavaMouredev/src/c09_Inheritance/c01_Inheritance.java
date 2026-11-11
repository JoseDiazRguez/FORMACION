package c09_Inheritance;

public class c01_Inheritance {
    public static void main(String[] args) {
        
        /* Herencia 
         * - Una clase puede heredar propiedades y comportamientos de otra
         * - La clase hija hereda los atributos y comportamientos de la clase padre
         */

        var animal = new Animal("Animal");      // Instanciando la clase
        animal.eat();

        var dog = new Dog("Snoopy", 5);
        dog.eat();

        var cat = new Cat("Garfield");
        cat.eat();

        var bird = new Bird("Piolín");
        bird.eat();

    }

    // Clases

    public static class Animal {

        // Atributos
        String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Métodos
        public void eat() {
            System.out.println("El animal con nombre " + name + " está comiendo.");
        }
    }

    // Clases hijas

    public static class Dog extends Animal {    // Herencia: Un hijo hereda de un padre. La clase Dog extende de la clase Animal

        // Atributos
        int age;

        // Constructor
        public Dog(String name, int age) {
            super(name);                        // super: llama al constructor de la clase padre
            this.age = age;
        }

        // Métodos
        @Override                               // --> Sobrescribir un método heredado de la clase padre
        public void eat() {         
            System.out.println("El perro con nombre " + name + " está comiendo.");
        }
        
        public void bark() {
            System.out.println("El perro esta ladrando.");
        }
    }

    public static class Cat extends Animal {

        // Constructor
        public Cat(String name) {
            super(name);
        }

        // Métodos
        public void meow() {
            System.out.println("El gato esta maullando.");
        }
    }

    public static class Bird extends Animal {

        // Constructor
        public Bird(String name) {
            super(name);
        }

        // Métodos
        public void fly() {
            System.out.println("El pajaro esta volando.");
        }
    }

}
