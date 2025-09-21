public class BankingSystem {
    public static void main(String[] args) {
        
        BankAccount acc1 = new SavingsAccount("S001", "Alice", 7000);
        BankAccount acc2 = new CurrentAccount("C001", "Bob", 12000);

        acc1.deposit(2000);
        acc2.withdraw(3000);

        acc1.calculateInterest();
        acc2.calculateInterest();

        ((Loanable) acc1).applyForLoan(20000);
        ((Loanable) acc2).applyForLoan(50000);
    }
}


interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance; 

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; 

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: " + interest);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account holder.");
        } else {
            System.out.println("Loan not approved for Savings Account holder.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000; 
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit = 1000; 
    private double interestRate = 0.02;  

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Current Account Interest: " + interest);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Current Account holder.");
        } else {
            System.out.println("Loan not approved for Current Account holder.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000; 
    }
}


