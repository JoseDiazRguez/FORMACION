package c08_oop;

public class BankAccount {      // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

    // Atributo
    double balance;

    // Constructor
    public BankAccount(double balance){
        this.balance = balance;
    }

    // Método
    public void deposit(double amount){
        if (amount > 0.0){
            this.balance += amount;
            System.out.println("Depósito realizado de: " + amount + " Euros - Saldo actual: " + balance + " Euros.");
        } else {
            System.out.println("El importe a depositar debe ser mayor que cero.");
        }
    }

}
