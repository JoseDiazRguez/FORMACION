package c11_Abstraction;

public class WashingMachine extends Appliance{

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
    // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

    @Override
    public void turnOn(){
        System.out.println("La lavadora se está encendiendo.");
    }

    @Override
    public void turnOff(){
        System.out.println("La lavadora se está apagando.");
    }
    
}
