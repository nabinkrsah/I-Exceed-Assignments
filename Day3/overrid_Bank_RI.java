class BankAccount {
     double balance;
     double interestRate;

    public BankAccount(double balance) {
        this.balance = balance;
        this.interestRate = 0.03; 
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayInterest() {
        System.out.println("Interest for BankAccount: ₹" + calculateInterest());
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
        this.interestRate = 0.05; 
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void displayInterest() {
        System.out.println("Interest for SavingsAccount: ₹" + calculateInterest());
    }
}

class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(double balance) {
        super(balance);
        this.interestRate = 0.07; 
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void displayInterest() {
        System.out.println("Interest for FixedDepositAccount: ₹" + calculateInterest());
    }
}

public class overrid_Bank_RI {
    public static void main(String[] args) {
        BankAccount general = new BankAccount(10000);
        BankAccount savings = new SavingsAccount(10000);
        BankAccount fixedDeposit = new FixedDepositAccount(10000);

        general.displayInterest();     
        savings.displayInterest();    
        fixedDeposit.displayInterest();  
    }
}
