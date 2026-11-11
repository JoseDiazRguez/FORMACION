package c09_Inheritance;

public class Truck extends Vehicle {

    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
    // un método describe() sobrescrito.

    // Constructor

    public Truck(String brand, String model) {
        super(brand, model);
    }

    // Métodos

    @Override
    public void describe(){
        System.out.println("Descripción del camión.");
    }

}
