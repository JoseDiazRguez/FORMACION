package c09_Inheritance;

public class Bike extends Vehicle {

    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
    // un método describe() sobrescrito.

    // Constructor

    public Bike(String brand, String model) {
        super(brand, model);
    }

    // Métodos

    @Override
    public void describe(){
        System.out.println("Descripción de la bicicleta.");
    }

}
