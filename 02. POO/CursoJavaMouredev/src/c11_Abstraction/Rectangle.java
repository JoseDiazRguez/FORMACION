package c11_Abstraction;

public class Rectangle extends Shape{

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
    // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
    // propia área.    

    private double width;
    private double height;

    public Rectangle(double width, double height){
        if (width > 0){
            this.width = width;
        } else {
            System.out.println("La anchura debe ser mayor que cero.");
        }
        if (height > 0){
            this.height = height;
        } else {
            System.out.println("La altura debe ser mayor que cero.");
        }
    }

    @Override
    public void calculateArea() {
        System.out.println(width * height);        
    }    
    
}
