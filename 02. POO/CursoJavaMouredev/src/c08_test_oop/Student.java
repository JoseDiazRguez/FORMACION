package c08_test_oop;

public class Student {

    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos
    // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
    
    // Atributos

    private double grade;

    // Constructor

    public Student(double grade){
        if (grade >= 0 && grade <= 100){
            this.grade = grade;
        } else {
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }

    // Getters & Setters

    public void setGrade(double grade){
        if (grade >= 0 && grade <= 100){
            this.grade = grade;
        } else {
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }

    // Métodos

    public boolean isPassed(){
        return grade >= 60;
    }

}
