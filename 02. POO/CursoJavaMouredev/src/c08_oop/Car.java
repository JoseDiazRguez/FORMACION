package c08_oop;

public class Car {      // 4. Crea una clase Car con atributos brand y model y un método showData().
    
    // Atributos
    String brand;
    String model;

    // Constructor
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    // Método
    public void showData(){
        System.out.println("Marca: " + brand + " - Modelo: " + model);
    }
}
