package c10_Polymorphism;

public class Book {

    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
    // deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
    // Product e imprime el precio final de cada uno.
    
    double discount = 20;

    public void getPrice(double number){
        if (number > 0){
            if (discount >= 0 && discount <= 100){
                double result = number * (100 - discount) / 100;
                System.out.printf("El valor final es de: %.2f Euros.\n", result);
            } else {
                System.out.println("El descuento debe ser un valor entre 0 y 100.");
            }
        } else {
            System.out.println("El valor a aplicar el descuento deber ser un número mayor que cero.");
        }
    }    

}
