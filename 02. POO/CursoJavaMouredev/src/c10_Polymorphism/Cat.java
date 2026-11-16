package c10_Polymorphism;

public class Cat extends Animal{

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
    // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
    // su tipo con su propio getType() sobrescrito.

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("El gato " + name + " hace \"Miau Miau\".");
    }

    public void getType(){
        System.out.println("Soy Gato.");
    }
    
}
