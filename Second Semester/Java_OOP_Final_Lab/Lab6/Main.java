public class Main {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Create an object of Calculation
        Calculation calc = new Calculation();

        // Take user input for a and b
        calc.takeInput();

        // Perform addition and subtraction and display the results
        System.out.println("\nAddition result: " + calc.Add());
        System.out.println("Subtraction result: " + calc.Subtract());

    }
}
