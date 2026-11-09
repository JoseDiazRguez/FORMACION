package c08_test_oop;

public class Employee {

    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método
    // raiseSalary(double percent) que solo permita aumentos positivos.

    // Atributos

    private String name;
    private double salary;

    // Constructor

    public Employee(String name, double salary){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre de usuario debe tener al menos 3 caracteres.");
        }
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que cero.");
        }
        
    }

    // Getters & Setters

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    // Métodos

    public void raiseSalary(double percent){
        if (percent > 0){
            double increase = salary * (percent / 100);
            this.salary += increase;
            System.out.println("Salario aumentado un " + percent + "% (" + increase + " Euros). Nuevo salario: " + salary + " Euros.");
        } else {
            System.out.println("El aumento de salario debe ser positivo.");
        }
    }

    public void showSalary(){
        System.out.println("El salario actual de " + name + " es de: " + salary);
    }
    
}
