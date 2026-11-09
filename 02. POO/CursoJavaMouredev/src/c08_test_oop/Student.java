package c08_test_oop;

public class Student {

    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos
    // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
    
    // Atributos

    private double grade;

    // Constructor

    public Student(double grade){
        this.grade = grade;
    }

    // Getters & Setters

    public void setGrade(double grade){
        this.grade = grade;
    }

    // Métodos

    public boolean isPassed(){
        return grade >= 60;
    }

}
