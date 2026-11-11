package c09_Inheritance;

public class Bird extends Animal{

    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
    // fly() pero también llame al método original con super.fly().

    // Atributos

    //protected String name;

    // Constructor

    public Bird(String name){
        super(name);
    }

    // Métodos

    public void fly(){
        System.out.println("El pájaro está volando.");
    }

    @Override
    public void makeSound(){
        System.out.println("El pájaro " + name + " hace \"Piuw\".");
    }
    
}
