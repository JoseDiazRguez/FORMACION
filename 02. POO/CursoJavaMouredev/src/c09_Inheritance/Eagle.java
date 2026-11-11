package c09_Inheritance;

public class Eagle extends Bird{

    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
    // fly() pero también llame al método original con super.fly().

    // Constructor

    public Eagle(String name){
        super(name);
    }

    // Métodos

    @Override
    public void fly(){
        super.fly();
        System.out.println("¡Es " + name + "!");
    }
    
}
