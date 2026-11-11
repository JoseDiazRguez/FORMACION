package c09_Inheritance;

public class Dog extends Animal{

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y
    // Cat diga "Meow" sobrescribiendo ese método.
    
    // Constructor

    public Dog(String name){
        super(name);
    }

    // Métodos personalizados --> Sobrescribir método de la Clase padre.

    @Override
    public void makeSound(){
        System.out.println("El perro " + name + " hace \"Woof\".");
    }

}
