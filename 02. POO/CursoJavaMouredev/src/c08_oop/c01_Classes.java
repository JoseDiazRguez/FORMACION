package c08_oop;

public class c01_Classes {
    // Una clase es un Objeto
    public static void main(String[] args){

        // Instanciando la clase Person
        var person = new Person("Pepe", 43,"123456789A");        // Creando un objeto de la clase Person
        var person2 = new Person("Vanessa", 45, "123456789B");    // Creando otro objeto de la clase Person

        //person.name = "Jose";                               // Asignando un valor a un atributo <-- No es necesario ya que se hace en el constructor
        //person.age = 43;

        person.sayHello();                                    // Llamando a un método de la clase
        person2.sayHello();

        // person.name = "Jose";
        //System.out.println(person.name);                    // Accediendo a un atributo solo si está public o protected

        person.setName("Jose");
        System.out.println(person.getName());
        
        System.out.println(person.getAge());                        
        person.setAge(-37);
        System.out.println(person.getAge());
        person.setAge(44);
        System.out.println(person.getAge());

        // person.setId("987654321A");                         // No se puede acceder, porque es private y no tenemos Setters
        System.out.println(person.getId());

        person.sayHello();

    }    
}
