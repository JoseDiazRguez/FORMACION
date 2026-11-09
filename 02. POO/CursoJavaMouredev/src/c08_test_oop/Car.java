package c08_test_oop;

public class Car {

    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
    // accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int
    // amount) que reduzca la velocidad (mí­nimo 0).

    // Atributos

    private double speed;
    private final int MIN_SPEED = 0;
    private final int MAX_SPEED = 120;

    // Constructor

    public Car(double speed){
        if (speed <= MAX_SPEED && speed >= 0){
            this.speed = speed;
        } else {
            System.out.println("La velocidad debe estar comprendido entre 0 y 120 km/h.");
        }
        
    }

    // Getters & Setters

    public double getSpeed(){
        return speed;
    }

    // Métodos

    public void accelerate(int amount){
        if (amount > 0){
            double newSpeed = speed + amount;
            if (newSpeed > MAX_SPEED){
                this.speed = MAX_SPEED;
            } else {
                this.speed = newSpeed;
            }
        } else {
            System.out.println("Debes introcucir un valor mayor que cero.");
        }
    }

    public void brake(int amount){
        if (amount > 0){
            double newSpeed = speed - amount;
            if (newSpeed < MIN_SPEED){
                this.speed = MIN_SPEED;
            } else {
                this.speed = newSpeed;
            }
        } else {
            System.out.println("Debes introcucir un valor mayor que cero.");
        }
    }

    public void showSpeed(){
        System.out.println("La velocidad actual es de: " + speed + " km/h.");
    }
    
}
