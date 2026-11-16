package c10_Polymorphism;

public class Animal {

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
    // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
    // su tipo con su propio getType() sobrescrito.

    protected String name;

    public Animal(String name){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre debe tener al menos 3 caracteres.");
        }
    }

    public void makeSound(){
        System.out.println("El animal hace sonido.");
    }

    public void getType(){
        System.out.println("Soy Animal.");
    }
    
}
