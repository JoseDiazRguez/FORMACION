package c08_test_oop;

public class BankAccount {

    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
    // métodos deposit(double amount) y withdraw(double amount) que validen las
    // cantidades correctamente.

    // Atributos

    private double balance;

    // Constructor

    public BankAccount(double balance){
        if (balance < 0){
            System.out.println("El balance inicial no puede ser negativo.");
        } else {
            this.balance = balance;
        }
    }

    // Getters & Setters

    // Métodos

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Se ha ingresado: " + amount + "\nEl balance actual es de: " + balance);
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        } 
    }

    public void withdraw(double amount){
        if (amount > 0){
            this.balance -= amount;
            System.out.println("Se ha retirado: " + amount + "\nEl balance actual es de: " + balance);
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } 
    }
    
}
