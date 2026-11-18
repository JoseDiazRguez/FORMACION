package c11_Abstraction;

public class Dog extends Animal{

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
    // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
    // mostrar polimorfismo.

    public Dog(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println(name +" hace \"Gua Gua\".");
    }
}
