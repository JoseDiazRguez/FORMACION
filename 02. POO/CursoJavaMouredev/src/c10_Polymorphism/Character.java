package c10_Polymorphism;

public class Character {    // Personaje

    // 10. Crea una clase Character con método attack(). Luego crea subclases
    // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
    // Character y llama a attack() para cada uno.

    protected String name;

    public Character(String name){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre dene tener al menos 3 caracteres");
        }
    }

    public void attack(){
        System.out.println("Ataque genérico.");
    }
    
}
