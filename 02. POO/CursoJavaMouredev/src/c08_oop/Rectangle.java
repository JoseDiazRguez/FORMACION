package c08_oop;

public class Rectangle {        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    
    // Atributos
    int width;
    int height;

    // Constructor
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    // Método
    public void calculateArea(){
        System.out.println("El área del rectágulo de base " + width + " y altura " + height + " es: " + width*height + " u^2.");
    }

    public void calculatePerimeter(){
        System.out.println("El perímetro del rectágulo de base " + width + " y altura " + height + " es: " + 2*(width + height) + " u.");
    }
}
