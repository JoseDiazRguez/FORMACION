package c09_Inheritance;

public class Person {

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase
    // Student que agregue el atributo grade y un método study().

    // Atributos

    protected String name;
    protected int age;

    // Constructor

    public Person(String name, int age){
        if (name != null && name.length() >= 3){
            this.name= name;
        } else {
            System.out.println("El nombre tiene que tener al menos 3 caractéres.");
        }
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("La edad tiene que ser positiva.");
        }

    }
    
}
