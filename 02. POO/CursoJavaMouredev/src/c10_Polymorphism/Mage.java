package c10_Polymorphism;

public class Mage extends Character{      // Mago

    // 10. Crea una clase Character con método attack(). Luego crea subclases
    // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
    // Character y llama a attack() para cada uno.

    public Mage(String name){
        super(name);
    }

    public void attack(){
        System.out.println("El mago " + name + " ataca con un hechizo.");
    }
    
}