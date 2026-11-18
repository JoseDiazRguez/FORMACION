package c11_Abstraction;

public abstract class Animal {

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
    // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
    // mostrar polimorfismo.

    protected String name;

    public Animal(String name){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre debe tener al menos 3 caracteres.");
        }
    }

    public void makeSound(){
        System.out.println("El animal hace un sonido.");
    }
    
}
