//  Exception Handling Fundamentals, Types of Exceptions, using exception clauses (try, catch, throw, throws and finally)

import java.io.*;

// Main class
public class C13 {

    // Method that declares a checked exception using throws
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println("File content: " + reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        // Example of try-catch-finally for handling exceptions
        try {
            int a = 10, b = 0;
            System.out.println("Result: " + (a / b)); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed (for cleanup or logging).");
        }

        // Example of checked exception (using throws)
        try {
            readFile("nonexistent_file.txt"); // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        // Example of using throw to explicitly throw an exception
        try {
            validateAge(15); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    // Method that uses throw to explicitly throw an exception
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Valid age: " + age);
    }
}
