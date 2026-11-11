package c09_Inheritance;

public class Employee {

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
    // Employee y agrega el atributo department.

    // Atributos

    protected String name;
    protected double salary;

    // Constructor

    public Employee(String name, double salary){
        if (name != null && name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("El nombre del trabajador tiene que tener al menos 3 caracteres.");
        }
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser una cantidad positiva.");
        }
    }
    
}
