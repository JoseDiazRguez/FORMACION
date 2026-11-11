package c09_Inheritance;

public class Account {

    // 8. Account tiene un saldo y métodos para deposit() y withdraw().
    // SavingsAccount hereda y agrega un método addInterest().

    // Atributos

    protected double balance;

    // Constructor

    public Account(double balance){
        if (balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("El saldo inicial debe ser mayor o igual que cero.");
        }
    }

    // Métodos

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Depósito realizado de: " + amount + " - Saldo actual: " + balance);
        } else {
            System.out.println("El depósito debe ser de una cantidad mayor que cero.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0){
            if (balance - amount >= 0){
                this.balance -= amount;
                System.out.println("Retirada realizada de: " + amount + " - Saldo actual: " + balance);
            } else {
                System.out.println("No se puede retirar una cantidad mayor que el saldo actual de: " + balance + " Euros.");
            }
        } else {
            System.out.println("El depósito debe ser de una cantidad mayor que cero.");
        }
    }
    
}
