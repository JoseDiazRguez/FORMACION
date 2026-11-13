package c10_Polymorphism;

public class Vehicle {

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
    // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
    // a start() en cada uno.
    
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model){
        if (brand != null && brand.length() >= 3){
            this.brand = brand;
        } else {
            System.out.println("La marca debe tener al menos 3 caracteres.");
        }
        if (model != null && model.length() >= 3){
            this.model = model;
        } else {
            System.out.println("El modelo debe tener al menos 3 caracteres.");
        }
    }

    public void start(){
        System.out.println("El vehículo inicia la marcha.");
    }
}
