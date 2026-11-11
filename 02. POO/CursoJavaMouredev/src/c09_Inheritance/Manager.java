package c09_Inheritance;

public class Manager extends Employee{

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
    // Employee y agrega el atributo department.

    // Atributos

    private String department;

    // Constructor

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    // Métodos

    public void showManager(){
        // Otra forma de hacer print:
        System.out.printf("%s gana %.2f euros en el departamento de %s.\n", name, salary, department);
    }
    
}
