package c09_Inheritance;

public class SavingsAccount extends Account{

    // 8. Account tiene un saldo y métodos para deposit() y withdraw().
    // SavingsAccount hereda y agrega un método addInterest().   
    
    // Atributos

    private double interestRate;

    // Constructor

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        if (interestRate >= 0){
            this.interestRate = interestRate;
        } else {
            System.out.println("El interés debe ser mayor o igual que cero.");
        }
    }

    // Métodos

    public void addInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Saldo actual: " + balance);
    }
    
}
