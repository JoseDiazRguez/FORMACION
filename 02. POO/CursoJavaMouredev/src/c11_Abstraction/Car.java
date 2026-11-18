package c11_Abstraction;

public class Car implements Movable{

    // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
    // Robot implementen ese método con comportamientos diferentes.

    public void move(){
        System.out.println("Los coches se mueven con cuatro ruedas.");
    }
    
}
