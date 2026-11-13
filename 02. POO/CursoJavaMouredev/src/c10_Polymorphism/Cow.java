package c10_Polymorphism;

public class Cow extends Animal{

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    public Cow(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("La vaca " + name + " hace \"Muuu Muuu\".");
    }
}
