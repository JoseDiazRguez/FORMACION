package c12_Composition;

public class c01_Composition_1 {
    
    public static void main(String[] args) {
        
        // Composición ("Tiene un") --- diferente a Herencia ("Es un")
        var car = new Car();
        car.engine.on();                        // Enciendo el motor desde car --> motor
    }

    public static class Engine {                // Motor
        public void on(){
            System.out.println("Motor encendido.");
        }
    }
    
    public static class Car {
        Engine engine = new Engine();
    }
    
}
