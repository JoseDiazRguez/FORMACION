package c08_test_oop;

public class Temperature {

    // 5. Crea una clase Temperature con el atributo privado celsius. El método
    // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

    // Atributos

    private double celsius;

    // Constructor

    public Temperature(double celsius){
        if (celsius >= -100 && celsius <= 100){
            this.celsius = celsius;
        } else {
            System.out.println("El valor debe estar comprendido entre -100 y 100 ºC.");
        }
    }

    // Getters & Setters

    public void setCelsius(double celsius){
        if (celsius >= -100 && celsius <= 100){
            this.celsius = celsius;
        } else {
            System.out.println("El valor debe estar comprendido entre -100 y 100 ºC.");
        }
    }

    // Métodos

    public void showTemperature(){
        System.out.println("La temperatura es de: " + celsius + " ºC.");
    }
    
}
