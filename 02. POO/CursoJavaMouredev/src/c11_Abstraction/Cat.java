package c11_Abstraction;

public class Cat extends Animal{

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
    // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
    // mostrar polimorfismo.

    public Cat(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(name + " hace \"Miau Miau\".");
    }
    
}
