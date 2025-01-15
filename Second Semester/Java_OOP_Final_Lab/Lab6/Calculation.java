import java.util.Scanner;

public class Calculation {
    private double a;
    private double b;

    // Method to perform addition
    public double Add() {
        return a + b;
    }

    // Method to perform subtraction
    public double Subtract() {
        return a - b;
    }

    // Method to take user input for a and b
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value for b: ");
        b = scanner.nextDouble();
    }
}
