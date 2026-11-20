package c14_extras;

public class ExtrasExample {

    public static void main(String[] args) {

        /* ACCESO A MÉTODOS Y ATRIBUTOS STATIC DE OTRA CLASE:
         * - Extras:             Nombre de la clase a la que queremos acceder.
         * - Extras.test():      Llama al método static test() de la clase Extras
         *                       sin necesidad de crear una instancia.
         * - Extras.globalName:  Accede al atributo static globalName de Extras.
         * - static:             Indica que el método o atributo pertenece a la
         *                       clase y no a una instancia concreta.
         * - public:             Permite acceder desde otras clases y paquetes.
         * - Acceso de paquete:  Si no se indica public, private o protected,
         *                       el atributo solo es accesible desde el mismo paquete.
         * - Instanciación:      No necesitamos utilizar new Extras() para acceder
         *                       a sus miembros static.
         */
        Extras.test();
        System.out.println(Extras.globalName);
    }
}