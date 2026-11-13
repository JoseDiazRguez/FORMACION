package c10_Polymorphism;

public class c01_Polymorphism {
    public static void main(String[] args) {

        // Poliformismo:
        // Se comporta de manera diferente dependiendo de la clase que lo implemente

        // - Poliformismo por herencia (sobrescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculator = new Calculator();
        System.out.println(calculator.sum(1,2));
        System.out.println(calculator.sum(1,3,4));
        System.out.println(calculator.sum(1.2,3.4));

    }


    public static class Animal{
        public void sound(){
            System.out.println("El animal hace un sonido.");
        }
    }

    public static class Dog extends Animal{             // --> Herencia
        @Override                                       // --> Polimorfismo por Herencia
        public void sound(){
            System.out.println("Guau guau");
        }
    }

    public static class Calculator{

        public int sum(int a, int b){
            return a + b;
        }

        public int sum(int a, int b, int c){
            return a + b + c;
        }

        public double sum(double a, double b){
            return a + b;
        }

    }

}
