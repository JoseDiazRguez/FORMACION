package c11_Abstraction;

public class Circle extends Shape implements Drawable{

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
    // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
    // propia área.    

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
    // Triangle que muestren cómo se dibuja cada figura usando draw().

    private double radius;

    public Circle(double radius){
        if (radius > 0){
            this.radius = radius;
        } else {
            System.out.println("El radio debe ser mayor que cero.");
        }
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * Math.pow(radius,2));        
    }    

    @Override
    public void draw(){
        System.out.println("El círculo es dibujado.");
    }
    
}
