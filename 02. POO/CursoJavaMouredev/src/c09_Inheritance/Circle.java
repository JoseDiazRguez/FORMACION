package c09_Inheritance;

public class Circle extends Shape{

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego
    // implementa ese método en Circle y Rectangle.

    // Atributos

    private double radius;

    // Constructor

    public Circle(double radius){
        if (radius > 0){
            this.radius = radius;
        } else {
            System.out.println("El radio tiene que ser mayor que cero.");
        }
        
    }

    // Métodos

    @Override
    public void calculateArea(){
        System.out.printf("El área del círculo de radio %.2f es de: %.2f u^2.\n", 
                            radius, Math.PI*Math.pow(radius, 2));
    }
    
}
