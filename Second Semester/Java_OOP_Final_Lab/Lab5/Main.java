public class Main {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Create a BankAccount object with an initial balance
        BankAccount myAccount = new BankAccount(5000); // Initial balance: 5000

        // Perform operations on the account
        System.out.println("\nInitial Balance: " + myAccount.getBalance());
        myAccount.deposit(1500); // Deposit 1500
        myAccount.withdraw(2000); // Withdraw 2000
        myAccount.setInterestRate(5); // Set interest rate to 5%
        myAccount.addInterest(); // Add interest

        // Display the final balance
        System.out.println("Final Balance: " + myAccount.getBalance());

    }
}
