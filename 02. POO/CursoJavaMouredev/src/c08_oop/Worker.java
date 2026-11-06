package c08_oop;

public class Worker {       // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    
    // Atributos
    String name;
    double salary;

    // Constructor
    public Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // Métodos
    public void printSalary(){
        System.out.println(name + " tiene un salario de " + salary + " Euros.");
    }


}
