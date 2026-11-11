package c09_Inheritance;

public class Cat extends Animal{

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y
    // Cat diga "Meow" sobrescribiendo ese método.
    
    // Constructor

    public Cat(String name){
        super(name);
    }

    // Métodos personalizados --> Sobrescribir método de la Clase padre.

    @Override
    public void makeSound(){
        System.out.println("El gato " + name + " hace \"Meow\".");
    }

}
