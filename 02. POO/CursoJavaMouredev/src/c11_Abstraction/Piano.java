package c11_Abstraction;

public class Piano implements Playable{

    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa
    // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
    // diferente al ejecutarse.

    @Override
    public void play() {
        System.out.println("Toca el piano");
    }
    
}
