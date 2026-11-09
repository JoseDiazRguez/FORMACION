package c08_test_oop;

public class Employee {

    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método
    // raiseSalary(double percent) que solo permita aumentos positivos.

    // Atributos

    private double salary;

    // Constructor

    public Employee(double salary){
        this.salary = salary;
    }

    // Getters & Setters

    public double getSalary(){
        return salary;
    }

    // Métodos

    public void raiseSalary(double percent){
        if (percent > 0){
            this.salary += percent;
        } else {
            System.out.println("El aumento de salario debe ser positivo.");
        }
    }
    
}
