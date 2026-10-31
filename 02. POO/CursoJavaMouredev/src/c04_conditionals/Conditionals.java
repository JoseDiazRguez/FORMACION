package c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {
        
        // Condicionales

        // If

        var age = 16;

        System.out.println(age >= 18);  // true o false dentro del if

        if (age > 18) {
            System.out.println("El usuario es mayor de edad.");
        } else if (age == 18) {
            System.out.println ("El usuario acaba de cumplir 18.");
        } else if (age < 18 && age > 15) {
            System.out.println ("El usuario tiene entre 16 y 17 años.");
        } else {
            System.out.println("El usuario es menor de edad.");
        } 

        // Switch

        var day = 6;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6,7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }

        // Forma moderna de representar el switch

        switch (day) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6,7 -> System.out.println("Fin de semana");
            default -> System.out.println("No es un dia de la semana");
        }

    }
}
