public class Account {
   
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        Account account = new Account();
        account.accountHolder = "John Doe";
        account.accountNumber = 123456;
        account.balance = 500.00;

        account.displayBalance();
        account.deposit(200);
        account.withdraw(100);
        account.withdraw(700);  
        account.displayBalance();
    }
}
