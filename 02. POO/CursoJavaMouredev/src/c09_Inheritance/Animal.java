package c09_Inheritance;

public class Animal {   

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y
    // Cat diga "Meow" sobrescribiendo ese método.

    // Atributos

    protected String name;

    // Constructor

    public Animal(String name){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("EL nombre del animal debe tener al menos 3 caracteres.");
        }
    }

    // Métodos

    public void makeSound(){
        System.out.println("El animal hace un sonido.");
    }
    
}
