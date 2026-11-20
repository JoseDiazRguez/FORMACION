package c13_exceptions;

public class SquareRoot {

    public double sqrt(int num) throws IllegalArgumentException {
        if (num < 0){
            throw new IllegalArgumentException("El número no puede ser negativo.");
        } else {
            return Math.sqrt(num);
        }
    }
}
