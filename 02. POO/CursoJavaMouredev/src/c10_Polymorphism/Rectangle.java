package c10_Polymorphism;

public class Rectangle extends Shape{

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
    // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
    // para recorrer e imprimir el Área de varias figuras.

    public Rectangle(double width, double height){
        super(width, height);
    }

    @Override
    public void calculateArea(){
        System.out.printf("El área del rectángulo de anchura %.2f u y altura %.2f u es de: %.2f u^2.\n", width, height, width * height);
    }
    
}
