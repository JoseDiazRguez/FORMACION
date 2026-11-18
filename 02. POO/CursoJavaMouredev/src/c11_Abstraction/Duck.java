package c11_Abstraction;

public class Duck implements Flyable, Swimmable{

    // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
    // implemente ambas interfaces y muestre cómo puede volar y nadar.

    @Override
    public void swim() {
        System.out.println("El pato está nadando.");
    }

    @Override
    public void fly() {
        System.out.println("El pato está volando.");
    }
    
}
