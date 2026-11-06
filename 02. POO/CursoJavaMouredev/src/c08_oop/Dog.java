package c08_oop;

public class Dog {      // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    
    // Atributos
    String name;

    // Constructor
    public Dog(String name){
        this.name = name;
    }

    // Método
    public void bark(){
        System.out.println(name + ": \"Gua Gua\"");
    }

}
