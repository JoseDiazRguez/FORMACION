package c10_Polymorphism;

public class Horse extends Animal{

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
    // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
    // su tipo con su propio getType() sobrescrito.
    
    public Horse(String name){
        super(name);
    }

    public void getType(){
        System.out.println("Soy Caballo.");
    }

}
