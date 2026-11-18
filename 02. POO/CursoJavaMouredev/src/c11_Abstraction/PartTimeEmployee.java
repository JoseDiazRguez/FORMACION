package c11_Abstraction;

public class PartTimeEmployee extends Employee{

    // 5. Crea una clase abstracta Employee con un método calculateSalary().
    // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
    // calcular el salario.

    private double precioHora;
    private double numHoras;
    
    public PartTimeEmployee(double precioHora, double numHoras){
        if (precioHora > 0){
            this.precioHora = precioHora;
        } else {
            System.out.println("El precio hora debe ser mayor que cero.");
        }
        if (numHoras > 0){
            this.numHoras = numHoras;
        } else {
            System.out.println("El número de horas debe ser mayor que cero.");
        }
    }

    public void calculateSalary(){
        double salary = precioHora * numHoras;
        System.out.printf("El salario es de: %.2f Euros al mes.\n", salary);
    }
    
}
