package c08_oop;

public class Rectangle {        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    
    // Atributos
    int base;
    int height;

    // Constructor
    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    // Método
    public void calculateArea(){
        System.out.println("El área del rectágulo de base " + base + " y altura " + height + " es: " + base*height + " u^2.");
    }

    public void calculatePerimeter(){
        System.out.println("El perímetro del rectágulo de base " + base + " y altura " + height + " es: " + 2*(base + height) + " u.");
    }
}
