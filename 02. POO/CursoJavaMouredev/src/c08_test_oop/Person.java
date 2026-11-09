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
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Métodos

    public void showPerson(){
        System.out.println(name + " tiene " + age + " años.");
    }
    
}
