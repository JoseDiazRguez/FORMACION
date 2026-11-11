package c09_Inheritance;

public class Vehicle {

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
    // que herede de Vehicle y agrega el método honk().

    // Atributos
    String brand;
    String model;

    // Constructor

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters & Setters

    // Métodos

    public void move(){
        System.out.println("El vehículo se mueve.");
    }

    public void describe(){
        System.out.println("Descripción del vehículo.");
    }
    
}
