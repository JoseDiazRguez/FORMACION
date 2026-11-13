package c10_Polymorphism;

public class Circle extends Shape{

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
    // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
    // para recorrer e imprimir el Área de varias figuras.

    public Circle(double radius){
        super(radius);
    }

    @Override
    public void calculateArea(){
        System.out.printf("El área del círculo de radio %.2f u es de: %.2f u^2.\n", radius, Math.pow(radius,2)*Math.PI);
    }
    
}