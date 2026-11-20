package c14_extras;

/* IMPORT:
 * - import:         Permite utilizar clases de otros paquetes sin escribir
 *                    su nombre completo cada vez que las necesitamos.
 * - Person:         Importa únicamente la clase Person.
 * - Temperature:    Importa únicamente la clase Temperature.
 * - *:              Importa los tipos accesibles directamente dentro
 *                    del paquete indicado (no incluye subpaquetes).
 * - java.util:      Paquete de Java que contiene utilidades como Scanner.
 */
import c08_test_oop.Person;
import c08_test_oop.Temperature;
// import c08_test_oop.*;

import java.util.Scanner;

public class Extras {

    /* VARIABLE DE CLASE (STATIC):
     * - static:         Indica que la variable pertenece a la clase Extras,
     *                    no a cada instancia u objeto.
     * - globalName:     Nombre del atributo de clase.
     * - String:         Tipo de dato que almacena texto.
     * - Ámbito:         Se puede utilizar desde los métodos static de Extras.
     * - Compartida:     Existe una única variable asociada a la clase,
     *                    compartida entre sus instancias.
     * - Acceso externo: Al no indicar public/private, tiene acceso de paquete.
     */
    static String globalName = "Díaz";

    public static void main(String[] args) {

        /* NULL:
         * - null:           Indica que una variable de referencia no apunta
         *                    a ningún objeto.
         * - name = null:    Elimina la referencia anterior al String "Jose".
         * - name != null:   Comprueba que la variable referencia un objeto.
         * - toLowerCase():  Convierte el texto a minúsculas.
         * - else:           Se ejecuta cuando la variable es null.
         * - Prevención:     Comprobar null antes de utilizar métodos del objeto
         *                    evita una NullPointerException.
         */
        String name = "Jose";
        name = null;

        if (name != null) {
            System.out.println(name.toLowerCase());
        } else {
            System.out.println("El nombre es null.");
        }

        /* UTILIZACIÓN DE CLASES IMPORTADAS:
         * - new:              Crea una instancia de una clase.
         * - Person(...):      Llama al constructor de Person con nombre y edad.
         * - Temperature(...): Llama al constructor de Temperature.
         * - println():        Muestra la representación textual del objeto.
         * - toString():       Java lo utiliza para representar el objeto
         *                      cuando se imprime con println().
         * - Instancias:       No se guardan en variables porque en este ejemplo
         *                      no necesitamos volver a utilizarlas.
         */
        System.out.println(new Person("Jose", 43));
        new Temperature(34);

        /* SCANNER (ENTRADA DE DATOS):
         * - Scanner:       Clase que permite leer datos de una entrada.
         * - System.in:     Entrada estándar, normalmente el teclado.
         * - new Scanner(): Crea una instancia para leer los datos.
         * - var:           Java infiere el tipo de la variable.
         * - nextInt():     Lee un número entero introducido por el usuario.
         * - age:           Variable local que almacena la edad introducida.
         * - close():       Cierra el Scanner y también System.in.
         */
        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        scanner.close();

        /* SCOPE (ÁMBITO DE LAS VARIABLES):
         * - Scope:         Determina desde qué partes del código se puede
         *                   acceder a una variable.
         * - Variable local: Se declara dentro de un método o bloque y solo
         *                   puede utilizarse dentro de su ámbito.
         * - Atributo:      Se declara dentro de una clase, fuera de sus métodos.
         * - static:        Permite acceder al atributo de clase desde métodos
         *                   static sin crear una instancia.
         * - test():        Llama al método definido fuera de main().
         */
        test();
    }

    /* MÉTODO STATIC Y ACCESO A ATRIBUTOS DE CLASE:
     * - public:         Permite que otras clases puedan acceder al método,
     *                    siempre que la clase también sea accesible.
     * - static:         Permite llamar al método sin crear un objeto Extras.
     * - void:           El método no devuelve ningún valor.
     * - test():         Nombre del método, sin parámetros.
     * - globalName:     Atributo static de Extras al que puede acceder
     *                    directamente desde este método.
     * - Acceso externo: Puede llamarse mediante Extras.test().
     */
    public static void test() {
        System.out.println(globalName);
    }
}
