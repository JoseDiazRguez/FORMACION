package c10_Polymorphism;

public class Dog extends Animal{

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("El perro " + name + " hace \"Guau Guau\".");
    }
    
}
