package c08_test_oop;

public class Car {

    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
    // accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int
    // amount) que reduzca la velocidad (mí­nimo 0).

    // Atributos

    private double speed;

    // Constructor

    public Car(double speed){
        if (speed <= 120 && speed >= 0){
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
            this.speed += amount;
            if (speed > 120){
                this.speed = 120;
            }
        } else {
            System.out.println("Debes introcucir un valor mayor que cero.");
        }
    }

    public void brake(int amount){
        if (amount > 0){
            this.speed -= amount;
            if (speed < 0){
                this.speed = 0;
            }
        } else {
            System.out.println("Debes introcucir un valor mayor que cero.");
        }
    }
    
}
