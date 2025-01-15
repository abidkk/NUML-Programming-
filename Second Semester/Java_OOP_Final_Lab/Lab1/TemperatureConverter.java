import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Method 1: Without user interaction (hardcoded value)
        double celsius1 = 25.0; // Example hardcoded value
        double fahrenheit1 = celsius1 * 9 / 5 + 32;
        System.out.println("\nWithout user interaction:");
        System.out.printf("Celsius: %.2f°C -> Fahrenheit: %.2f°F%n%n", celsius1, fahrenheit1);

        // Method 2: With user interaction
        Scanner scanner = new Scanner(System.in);
        System.out.println("With user interaction:");
        System.out.print("Enter temperature in Celsius: ");
        double celsius2 = scanner.nextDouble();
        double fahrenheit2 = celsius2 * 9 / 5 + 32;
        System.out.printf("Celsius: %.2f°C -> Fahrenheit: %.2f°F%n%n", celsius2, fahrenheit2);
    }
}
