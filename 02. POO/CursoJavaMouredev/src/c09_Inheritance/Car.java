package c09_Inheritance;

public class Car extends Vehicle {

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
    // que herede de Vehicle y agrega el método honk().
    
    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
    // un método describe() sobrescrito.

    // Constructor

    public Car(String brand, String model) {
        super(brand, model);
    }

    // Métodos

    public void honk(){
        System.out.println("El coche está bocinando.");
    }

    @Override
    public void describe(){
        System.out.println("Descripción del coche.");
    }

}
