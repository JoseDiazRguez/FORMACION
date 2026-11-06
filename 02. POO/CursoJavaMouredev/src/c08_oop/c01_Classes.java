package c08_oop;

public class c01_Classes {
    // Una clase es un Objeto
    public static void main(String[] args){

        // Instanciando la clase Person
        var person = new Person("Jose", 43);        // Creando un objeto de la clase Person
        var person2 = new Person("Vanessa", 45);    // Creando otro objeto de la clase Person

        //person.name = "Jose";                               // Asignando un valor a un atributo <-- No es necesario ya que se hace en el constructor
        //person.age = 43;

        person.sayHello();                                    // Llamando a un método de la clase
        person2.sayHello();
    }    
}
