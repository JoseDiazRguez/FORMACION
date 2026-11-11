package c09_Inheritance;

public class Student extends Person {

    // Atributos

    private String grade;

    // Constructor

    public Student (String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }

    // Métodos

    public void study(){
        System.out.println(name + " está estudiando " + grade + " con " + age + " años.");
    }
    
}
