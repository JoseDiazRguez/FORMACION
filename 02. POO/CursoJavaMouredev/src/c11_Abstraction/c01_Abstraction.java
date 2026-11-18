package c11_Abstraction;

/* ABSTRACCIÓN (Abstraction):
 *
 * - Definición:       Principio de la programación orientada a objetos que permite
 *                     mostrar las características y comportamientos esenciales de
 *                     un objeto, ocultando los detalles innecesarios de implementación.
 *
 * - Objetivo:         Definir QUÉ debe hacer un objeto, sin necesidad de conocer
 *                     todos los detalles de CÓMO lo hace.
 *
 * - Implementación:   En Java podemos aplicar la abstracción mediante clases
 *                     abstractas e interfaces, entre otros mecanismos.
 *
 * - Contrato:         Establece métodos que determinadas clases deben proporcionar,
 *                     asegurando una estructura y comportamientos comunes.
 *
 * - Seguridad:        Favorece la encapsulación y reduce el acoplamiento, porque
 *                     permite utilizar objetos sin depender de su implementación.
 *                     No supone, por sí misma, una protección de seguridad informática.
 *
 * - Polimorfismo:     Permite trabajar con objetos de diferentes clases mediante
 *                     un tipo común y ejecutar sus implementaciones específicas.
 *
 * - Ventajas:         Facilita el mantenimiento, la reutilización, la extensibilidad
 *                     y la organización del código.
 *
 * - Herramientas:     Clases abstractas e interfaces.
 */

public class c01_Abstraction {

    public static void main(String[] args) {

        // Clase abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        dog.sleep();
        cat.sound();

    }

    
    /* CLASE ABSTRACTA (Abstract Class):
    *
    * - Definición:         Clase que sirve como base para otras clases, estableciendo
    *                       una jerarquía común y compartiendo características y métodos.
    *
    * - Declaración:        Se define utilizando la palabra clave "abstract".
    *                       --> Ejemplo: public abstract class Animal { }
    *
    * - Instanciación:      No se puede instanciar directamente.
    *                       --> Ejemplo: No es válido utilizar new Animal().
    *
    * - Herencia:           Las clases hijas heredan de ella utilizando "extends".
    *                       --> Ejemplo: public class Dog extends Animal { }
    *
    * - Herencia simple:    Una clase Java solo puede extender de una clase padre directa.
    *                       --> Ejemplo: No puede extender simultáneamente de varias clases.
    *
    * - Jerarquía:          Representa una relación "ES UN".
    *                       --> Ejemplo: Dog ES UN Animal.
    *
    * - Métodos abstractos: Se declaran con "abstract", sin implementación.
    *                       --> Ejemplo: public abstract void sound();
    *
    * - Contrato:           Las clases hijas concretas deben implementar todos los
    *                       métodos abstractos heredados que sigan pendientes.
    *
    * - Métodos concretos:  Puede contener métodos ya implementados que las clases
    *                       hijas heredan y pueden sobrescribir cuando esté permitido.
    *                       --> Ejemplo: public void sleep() { ... }
    *
    * - Propiedades:        Puede contener atributos de instancia, atributos static,
    *                       constantes, constructores y métodos concretos o abstractos.
    *
    * - Constructores:      Puede tener constructores, aunque no pueda instanciarse.
    *                       Las clases hijas los invocan mediante super(...).
    *
    * - @Override:          Se utiliza al implementar o sobrescribir métodos heredados.
    *
    * - Implementación:     No todos los métodos deben sobrescribirse: 
    *                       --> Los concretos pueden heredarse sin modificaciones.
    *
    * - Cuándo usarla:      Cuando varias clases pertenecen a una misma jerarquía y
    *                       necesitan compartir estado, lógica o comportamiento común.
    *
    * --> Ejemplo:          Animal puede definir sound() como abstracto y sleep()
    *                       como método concreto que sus subclases heredan.
    */

    public static abstract class Animal {

        public abstract void sound();           // Método abstracto

        public void sleep() {
            System.out.println("El animal está durmiendo.");
        }
    }

    public static class Dog extends Animal {

        @Override 
        public void sound() {
            System.out.println("El perro hace \"Gua gua\".");
        }

        @Override 
        public void sleep() {
            System.out.println("El perro esta durmiendo.");
        }
    }

    public static class Cat extends Animal {

        @Override 
        public void sound() {
            System.out.println("El gato hace \"Meow\".");
        }
    }

    /* INTERFAZ (Interface):
    *
    * - Definición:       Tipo de referencia que establece un contrato de
    *                     comportamientos que las clases pueden implementar.
    *
    * - Declaración:      Se define utilizando la palabra clave "interface".
    *                     --> Ejemplo: public interface Flying { }
    *
    * - Instanciación:    No puede instanciarse directamente mediante new Flying().
    *
    * - Implementación:   Una clase utiliza "implements" para implementar interfaces.
    *                     --> Ejemplo: public class Bird implements Flying { }
    *
    * - Contrato:         Una clase concreta que implementa una interfaz debe
    *                     proporcionar los métodos abstractos exigidos por ella,
    *                     salvo que ya los herede implementados.
    *
    * - Capacidades:      Permite definir comportamientos que diferentes clases
    *                     pueden compartir, aunque pertenezcan a distintas jerarquías.
    *                     --> Ejemplo: Bird y Bat pueden implementar Flying.
    *
    * - Relación:         Representa una capacidad o comportamiento.
    *                     --> Ejemplo: Bird PUEDE VOLAR.
    *
    * - Métodos:          Puede declarar métodos abstractos, default, static
    *                     y métodos privados con implementación.
    *
    * - Métodos default:  Incorporan una implementación que las clases pueden heredar
    *                     sin necesidad de sobrescribirla.
    *
    * - Propiedades:      Puede declarar constantes, que son implícitamente
    *                     public static final. No admite atributos de instancia.
    *
    * - Constructores:    No puede tener constructores.
    *
    * - Herencia:         Una interfaz puede extender una o varias interfaces
    *                     utilizando "extends".
    *
    * - Múltiples interfaces:
    *                     Una clase puede implementar varias interfaces a la vez.
    *                     --> Ejemplo: public class Bird implements Flying, Flying2 { }
    *
    * - Herencia múltiple de comportamientos:
    *                     Permite combinar varios contratos en una misma clase,
    *                     sin permitir la herencia múltiple de clases.
    *
    * - Implementación selectiva:
    *                     No todas las clases de una jerarquía deben implementar
    *                     la misma interfaz; solo las que necesiten esa capacidad.
    *
    * - @Override:        Se utiliza al implementar los métodos de la interfaz.
    *
    * - Polimorfismo:     Una variable de tipo interfaz puede referenciar objetos
    *                     de cualquier clase que la implemente.
    *
    * - Cuándo usarla:    Cuando queremos definir capacidades o contratos comunes
    *                     para clases que pueden pertenecer a jerarquías diferentes.
    *
    * --> Ejemplo:        Flying define fly(). Bird y Bat pueden implementarla,
    *                     mientras que Dog y Cat no necesitan hacerlo.
    */

    public interface Flying {       // Da la capacidad a las clases que implementen la interface de volar
        void fly();
    }

    public interface Flying2 {
        void fly2();
    }

    public static class Bird extends Animal implements Flying, Flying2 {

        @Override 
        public void sound() {
            System.out.println("El pájara hace \"Pio pio\".");
        }

        @Override 
        public void fly() {
            System.out.println("El pájaro vuela.");
        }

        @Override 
        public void fly2() {
            System.out.println("El pájaro vuela.");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override 
        public void sound() {
            System.out.println("El murciélago dice \"Soy Batman\".");
        }

        @Override 
        public void fly() {
            System.out.println("El murciélago vuela.");
        }
    }
}
