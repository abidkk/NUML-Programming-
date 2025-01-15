public class BankAccount {
    private double balance;
    private double interestRate; // in percentage (e.g., 5 for 5%)

    // Constructor to initialize the account with a starting balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.interestRate = 0; // Default interest rate
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to set the interest rate
    public void setInterestRate(double rate) {
        if (rate >= 0) {
            this.interestRate = rate;
            System.out.println("Interest rate set to: " + rate + "%");
        } else {
            System.out.println("Invalid interest rate.");
        }
    }

    // Method to add interest to the balance
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
