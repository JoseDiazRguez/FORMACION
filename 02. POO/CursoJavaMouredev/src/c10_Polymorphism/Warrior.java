package c10_Polymorphism;

public class Warrior extends Character{      // Guerrero

    // 10. Crea una clase Character con método attack(). Luego crea subclases
    // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
    // Character y llama a attack() para cada uno.

    public Warrior(String name){
        super(name);
    }

    public void attack(){
        System.out.println("El guerrero " + name + " ataca con las manos.");
    }
    
}
