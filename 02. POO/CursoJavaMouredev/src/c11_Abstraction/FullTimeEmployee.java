package c11_Abstraction;

public class FullTimeEmployee extends Employee{

    // 5. Crea una clase abstracta Employee con un método calculateSalary().
    // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
    // calcular el salario.

    private double salary;
    
    public FullTimeEmployee(double salary){
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que cero.");
        }
    }

    public void calculateSalary(){
        System.out.printf("El salario es de: %.2f Euros al mes.\n", salary);
    }
    
}
