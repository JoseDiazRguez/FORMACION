package c14_extras;

public class User {

    // 9. Define una clase User con una constante APP_NAME, una variable global
    // username y una función que imprima ambas.

    /* MODIFICADORES DE ATRIBUTOS:
    * - public:        Permite acceder al atributo desde otras clases.
    * - static:        El atributo pertenece a la clase y es compartido
    *                  por todas sus instancias.
    * - final:         Impide reasignar el atributo después de inicializarlo.
    * - static final:  Se utiliza habitualmente para definir constantes de clase.
    * - Orden:         Por convención, public static final.
    * - Constantes:    Se nombran en MAYÚSCULAS_CON_GUIONES_BAJOS.
    */
    public static final String APP_NAME = "AppName";
    public static String username = "josedr";

    public static void showUser(){
        System.out.println(username);
    }
    
}
