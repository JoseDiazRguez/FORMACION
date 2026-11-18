package c12_Composition;

public class c01_Composition_2 {
    
    public static void main(String[] args) {

        /* COMPOSICIÓN (Composition):
        *
        * - Definición:       Técnica de programación orientada a objetos en la que
        *                     una clase contiene objetos de otras clases como atributos,
        *                     formando una estructura de componentes.
        *
        * - Relación:         Representa una relación "TIENE UN" (HAS-A).
        *                     --> Ejemplo: Un Car TIENE UN Engine.
        *
        * - Diferencia:       La herencia representa "ES UN" (IS-A).
        *                     --> Ejemplo: Un Dog ES UN Animal.
        *
        * - Implementación:   Se consigue declarando un objeto de otra clase como atributo.
        *                     --> Ejemplo: private final Engine engine = new Engine();
        *
        * - Instanciación:    Las clases pueden instanciarse de forma independiente,
        *                     aunque una clase puede crear sus componentes internamente.
        *
        * - Encapsulación:    Los atributos private impiden acceder directamente a ellos
        *                     desde clases externas, permitiendo controlar su uso.
        *
        * - Delegación:       Una clase puede utilizar métodos de sus componentes
        *                     para realizar determinadas operaciones.
        *                     --> Ejemplo: Car.start() llama a Engine.on().
        *
        * - Reutilización:    Permite reutilizar funcionalidades de otras clases
        *                     sin necesidad de heredar de ellas.
        *
        * - Jerarquía:        No establece una jerarquía padre-hijo como la herencia.
        *                     Los objetos colaboran entre sí.
        *
        * - Flexibilidad:     Facilita sustituir componentes por otras implementaciones,
        *                     especialmente cuando se utilizan interfaces.
        *
        * - final:            Impide reasignar la referencia del atributo a otro objeto,
        *                     pero no impide modificar el estado del objeto referenciado.
        *
        * - Ciclo de vida:    En una composición estricta, el componente pertenece
        *                     conceptualmente al objeto contenedor y su ciclo de vida
        *                     suele estar vinculado a él.
        *
        * - Cuándo usarla:    Cuando una clase NECESITA o CONTIENE otro objeto para
        *                     realizar sus funciones, pero no ES un tipo de ese objeto.
        *
        * - Ventajas:         Favorece la encapsulación, modularidad, mantenimiento
        *                     y reutilización del código, reduciendo el acoplamiento.
        */
        
        // Composición ("Tiene un") --- diferente a Herencia ("Es un")
        var car = new Car();   
        car.start();                    // Pero ahora también sccedo directamente al motor desde car
        car.engine.on();                /* Declarado engine como private, por lo que car.engine.on() 
                                        * no es accesible desde main(), aunque main() esté dentro de 
                                        * la clase externa c01_Composition_2. Al ser Car una clase anidada, 
                                        * Java permite ese acceso desde su clase contenedora. 
                                        * Sin embargo, no sería accesible desde una clase externa independiente. 
                                        */ 
    }

    public static class Engine {                // Motor
        public void on(){
            System.out.println("Motor encendido.");
        }
    }

    public static class Car {
        final private Engine engine = new Engine();   // No quiero que se acceda al motor desde fuera (private)

        public void start(){                    // Acceso directo al motor desde aquí
            engine.on();
        }
    }
}