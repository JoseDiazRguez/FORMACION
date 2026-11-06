package c08_oop;

public class Product {      // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    
    // Atributos
    String nameProduct;
    double price;

    // COnstructor
    public Product(String nameProduct, double price){
        this.nameProduct = nameProduct;
        this.price = price;
    }

    // Métodos
    public void priceWithDiscount(double discount){
        this.price = price*(1-(discount/100));
        System.out.println("El precio actual del producto " + nameProduct + ", con el descuento aplicado del " + discount + " %, se queda en: " + price + " Euros.");
    }

}
