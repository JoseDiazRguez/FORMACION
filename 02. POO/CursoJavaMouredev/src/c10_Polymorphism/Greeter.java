package c10_Polymorphism;

public class Greeter {

    // 4. Crea una clase Greeter con dos método greet(): uno que salude con
    // "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

    @SuppressWarnings("unused")
    private String name;

    public Greeter(){
    }

    public Greeter(String name){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre debe tener al menos 3 caracteres.");
        }
    }

    public static void greet(){
        System.out.println("Hello");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name);
    }
    
}
