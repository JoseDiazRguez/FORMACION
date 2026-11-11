package c09_Inheritance;

public class Rectangle extends Shape {

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego
    // implementa ese método en Circle y Rectangle.
    
    // Atributos

    private double width;
    private double height;

    // Constructor

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

    // Métodos

    @Override
    public void calculateArea(){
        System.out.printf("El área del rectángulo de anchura %.2f y altura %.2f, es de: %.2f u^2.\n", 
                            width, height, width * height);
    }

}
