public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 1500.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA98765", 2500.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD55555", 5000.0, 12);

        savings.displayAccountType();
        savings.displayDetails();

        System.out.println();

        checking.displayAccountType();
        checking.displayDetails();

        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();
    }
}

// Superclass
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    public double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    public int depositDuration; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositDuration) {
        super(accountNumber, balance);
        this.depositDuration = depositDuration;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Duration: " + depositDuration + " months");
    }
}
