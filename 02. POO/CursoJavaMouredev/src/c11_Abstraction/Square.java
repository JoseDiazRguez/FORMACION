package c11_Abstraction;

public class Square implements Drawable {

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
    // Triangle que muestren cómo se dibuja cada figura usando draw().

    public void draw(){
        System.out.println("El cuadrado es dibujado.");
    }
    
}
