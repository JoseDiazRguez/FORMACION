package c08_test_oop;

public class Rectangle {

    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
    // setters y el método calculateArea() que devuelva el resultado de width * height.
    
    // Atributos

    private double width;
    private double height;

    // Constructor

    public Rectangle(double width, double height){
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("La anchura debe ser positiva.");
        }
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("La altura debe ser positiva.");
        }
    }

    // Getters & Setters

    public void setWidth(double width){
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("La anchura debe ser positiva.");
        }
    }
    public void setHeight(double height){
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("La altura debe ser positiva.");
        }
    }

    // Métodos

    public void calculateArea(){
        System.out.println("El área de un rectángulo de anchura " + width + " y altura " + height + " es de: " + (width * height) + " u^2." );
    }

}
