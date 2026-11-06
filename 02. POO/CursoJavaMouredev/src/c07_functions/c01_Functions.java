package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class c01_Functions {
    public static void main(String[] args) {

        // Sin retorno:

        // Llamadas a la función sin parámetros

        for (int i = 0; i < 5; i++) {
            sendEmail();
        }
        
        sendEmail();

        // Llamadas a la función con sobrecarga

        sendEmailToUser("josediazrguez@gmail.com");
        sendEmailToUser("josediazrguez@gmail.com", "Jose Diaz");

        var users = new ArrayList<String>(Arrays.asList("diazrguez@gmail.com", "rodriguez@gmail.com", "vanessada@gmail.com"));
        sendEmailToUser(users);

        // Con retorno:

        // Llamadas a la función con retorno sin parámetros

        var state = sendEmailWithStateWithoutParameters();
        System.out.println("El estado de la llamada es: " + state);

        // Llamadas a la función con retorno y parámetros

        var state2 = sendEmailWithState("josediazrguezgmail.com");
        System.out.println("El estado de la llamada es: " + state2);

        state2 = sendEmailWithState("josediazrguez@gmail.com");
        System.out.println("El estado de la llamada es: " + state2);

    }

    /*Funciones sin retorno:
     * - Son bloques de código que realizan una tarea específica.
     * - Se pueden reutilizar en diferentes partes del programa.
     * - Pueden recibir parámetros.
     * - No devuelven ningún valor, por lo que su tipo de retorno es "void".
     * */

    // Función sin parámetros y sin valor de retorno
    public static void sendEmail() {
        System.out.println("Se ha enviado un correo electrónico.");
    }

    /* Sobre carga de funciones: 
     * - Permite definir múltiples funciones con el mismo nombre pero con diferentes parámetros. 
     * - Esto permite que una función pueda ser llamada de diferentes maneras según los argumentos proporcionados. 
     * */

    // Función 1: con un parámetro
    public static void sendEmailToUser(String email) {
        System.out.println("Se ha enviado un correo electrónico a " + email + ".");
    }

    // Función 2: con dos parámetros
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se ha enviado un correo electrónico a " + name + " (" + email + ").");
    }

    // Función 3: con parámetro de tipo ArrayList
    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            sendEmailToUser(email);         // Llamada a la Función 1, reutilizando funciones ya definidas para aprovechar código existente 
            //                                 y mantener la consistencia en el comportamiento de la función.
        }
    }

    /* Funciones con retorno:
     * - Son bloques de código que realizan una tarea específica.
     * - Se pueden reutilizar en diferentes partes del programa.
     * - Pueden recibir parámetros.
     * - Devuelven un valor, por lo que su tipo de retorno es distinto de "void".
     * */

    // Función sin parámetros y con valor de retorno
    public static boolean sendEmailWithStateWithoutParameters() {
        System.out.println("Se ha enviado un correo electrónico.");
        return true;
    }

    // Función con parámetro y con valor de retorno
    public static boolean sendEmailWithState(String email) {
        if (email.contains("@")) {
            System.out.println("El correo electrónico debe contener un '@'.");
            return false;
        }   // --> No sería necesario "else" ya que el "return" finaliza la ejecución de la función
        System.out.println("Se ha enviado un correo electrónico a " + email + ".");
        return true;
    }

}
