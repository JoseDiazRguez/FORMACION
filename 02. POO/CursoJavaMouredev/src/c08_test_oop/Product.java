package c08_test_oop;

public class Product {

    // 2. Crea una clase Product con el atributo privado price. Añade el método
    // setPrice(double price) que solo permita precios mayores a 0.

    // Atributos

    private String name;
    private double price;

    // Constructor
    
    public Product(String name, double price){
        this.name = name;
        if (price > 0){
            this.price = price;
            System.out.println("Alta de: " + name + " - precio: " + price + " Euros.");
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }

    // Getters & Setters

    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        if (price > 0){
            this.price = price;
            System.out.println("Precio de " + name + " actualizado a: " + price + " Euros.");
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }

}
