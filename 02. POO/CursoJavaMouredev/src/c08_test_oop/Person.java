package c08_test_oop;

public class Person {       

    // 1. Crea una clase Person con atributos privados name y age. Usa los métodos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.

    // Atributos
    
    private String name;
    private int age;

    // Constructor

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters & Setters

    public String getName(){
        return name;
    }
    public int setAge(){
        return age;
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
        
    }
    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        } else {
            System.out.println("La edad deber estar entre 0 y 120 años.");
        }
    }

    // Métodos

    public void showPerson(){
        System.out.println(name + " tiene " + age + " años.");
    }
    
}
