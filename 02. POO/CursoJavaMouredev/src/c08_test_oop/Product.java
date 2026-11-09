package c08_test_oop;

public class Product {

    // 2. Crea una clase Product con el atributo privado price. Añade el método
    // setPrice(double price) que solo permita precios mayores a 0.

    // Atributos

    private double price;

    // Constructor
    
    public Product(double price){
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }

    // Getters & Setters

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }

    // Métodos

    public void showPrice(){
        System.out.println("El precio del producto es: " + price);
    }
}
