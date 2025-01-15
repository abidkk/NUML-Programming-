import java.util.Scanner;

public class BalanceChecker {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Define the current balance
        double currentBalance = 5000.00; // Example balance

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the amount to be drawn: ");
        double amount = scanner.nextDouble();

        // Check if the amount is available
        if (amount <= currentBalance) {
            System.out.println("Amount is available.");
        } else {
            System.out.println("Amount is not available.");
        }

    }
}
