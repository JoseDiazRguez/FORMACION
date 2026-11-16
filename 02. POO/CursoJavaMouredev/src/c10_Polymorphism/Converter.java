package c10_Polymorphism;

public class Converter {

    // 8. Crea una clase Converter con método convert(int), convert(double), y
    // convert(String) que devuelvan diferentes formatos de texto.

    // Sobrecarga de métodos

    public String convert(int number){
        return Integer.toString(number);            // Conversión de tipo
    }

    public String convert(double numberDouble){
        return Double.toString(numberDouble);       // Conversión de tipo
    }

    public String convert(String text){
        return text;
    }

    public void check(Object checkResult){          // Comprobamos si el Objeto es un String (Centralizamos check para no repetirlo)
        if (checkResult instanceof String){
            System.out.printf("Conversión correcta: %s es un String.\n", checkResult); 
        } else {
            System.out.println("La conversión no fue correcta.");
        }
    }

}
