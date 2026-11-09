package c08_test_oop;

public class Rectangle {

    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
    // setters y el método calculateArea() que devuelva el resultado de width * height.
    
    // Atributos

    private double width;
    private double hight;

    // Constructor

    public Rectangle(double width, double hight){
        this.width = width;
        this.hight = hight;
    }

    // Getters & Setters

    public void setWidth(double width){
        this.width = width;
    }
    public void serHight(double hight){
        this.hight = hight;
    }

    // Métodos

    public void calculateArea(){
        System.out.println("El área de un rectángulo de anchura " + width + " y altura " + hight + " es de: " + (width * hight) + " u^2." );
    }

}
