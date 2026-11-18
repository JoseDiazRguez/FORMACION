package c11_Abstraction;

public abstract class Appliance {

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
    // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

    public void turnOn(){
        System.out.println("Encendiendo.");
    }

    public void turnOff(){
        System.out.println("Apagando.");
    }
    
}
