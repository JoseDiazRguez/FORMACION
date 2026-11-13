package c10_Polymorphism;

public class Cat extends Animal{

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("El gato " + name + " hace \"Miau Miau\".");
    }
    
}
