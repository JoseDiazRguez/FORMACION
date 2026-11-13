package c10_Polymorphism;

public class Truck extends Vehicle{

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
    // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
    // a start() en cada uno.

    public Truck(String brand, String model){
        super(brand, model);
    }

    @Override
    public void start(){
        System.out.println("El " + brand + " " + model + " arranca.");
    }
    
}
