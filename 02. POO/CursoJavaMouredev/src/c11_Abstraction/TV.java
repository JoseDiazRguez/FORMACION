package c11_Abstraction;

public class TV extends Appliance{

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
    // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

    @Override
    public void turnOn(){
        System.out.println("La televisión se está encendiendo.");
    }

    @Override
    public void turnOff(){
        System.out.println("La televisión se está apagando.");
    }
    
}
