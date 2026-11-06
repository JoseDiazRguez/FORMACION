package c08_oop;

public class Student {      // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    
    // Atributos
    String name;
    double score;

    // Constructor
    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }

    // Método
    public void isApproved(){
        if (score < 60){
            System.out.println ("El estudiante ha suspendido");
        } else {
            System.out.println ("El estudiante ha aprobado");
        }
    }

}
