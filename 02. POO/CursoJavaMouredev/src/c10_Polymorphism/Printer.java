package c10_Polymorphism;

public class Printer {

    // 3. Crea una clase Printer con varios método print() sobrecargados que
    // acepten diferentes tipos de parámetros (String, int, double). Llama a cada
    // uno desde main.
    
    protected String text;
    protected int number;
    protected double numberDouble;

        /* Sobrecarga de constructores (Constructor Overloading):
        * - Mismo nombre:    Todos los constructores tienen el nombre de la clase (Printer).
        * - Parámetros:      Deben diferenciarse en cantidad, tipo u orden de tipos.
        * - Finalidad:       Permitir crear objetos de una misma clase de diferentes formas.
        * - Java:            Selecciona el constructor adecuado según los argumentos recibidos.
        */
    public Printer(String text){
        if (text != null){
            this.text = text;
        } else {
            System.out.println("El texto no puede estar vacío.");
        }
    }
    public Printer(int number){
        this.number = number;
    }
    public Printer(double numberDouble){
        this.numberDouble = numberDouble;
    }

        /* Sobrecarga de métodos (Overloading):
        * - Mismo nombre:     Varios métodos comparten el mismo nombre.
        * - Parámetros:       Deben diferenciarse en cantidad, tipo u orden de tipos.
        * - Tipo de retorno:  Puede cambiar, pero no basta por sí solo.
        * - Herencia:         No es necesaria.
        * - Java:             Selecciona el método según los argumentos.
        * - static:           El método pertenece a la clase, no a sus objetos.
        *                       Permite llamarlo sin crear una instancia de la clase.
        * - Sin static:       El método pertenece a una instancia y requiere un objeto
        *                       para llamarlo desde un contexto externo.
        */
    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int number){
        System.out.println(number);
    }
    public static void print(double numberDouble){
        System.out.println(numberDouble);
    }
}
