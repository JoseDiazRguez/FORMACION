package c10_Polymorphism;

public class Shape {

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
    // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
    // para recorrer e imprimir el Área de varias figuras.

    protected double width;
    protected double height;
    protected double radius;

    public Shape(double width, double height){
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

    public Shape(double radius) {
        if (radius > 0){
            this.radius = radius;
        } else {
            System.out.println("El radio debe ser mayor que cero.");
        }
    }

    public void calculateArea(){
        System.out.println("Definir el cálculo del área.");
    }
    
}
