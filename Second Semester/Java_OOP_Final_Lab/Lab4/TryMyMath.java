

public class TryMyMath {
    // Method to print a number, its square, and its cube (all rounded to 100th)
    public static void printNumberDetails(double number) {
        double roundedNumber = MyMath.roundToNearest100th(number);
        double roundedSquare = MyMath.roundToNearest100th(Math.pow(number, 2));
        double roundedCube = MyMath.roundToNearest100th(Math.pow(number, 3));

        System.out.println("Number (rounded to 100th): " + roundedNumber);
        System.out.println("Square (rounded to 100th): " + roundedSquare);
        System.out.println("Cube (rounded to 100th): " + roundedCube);
    }

    // Main method
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Call printNumberDetails with Math.E
        System.out.println("\nDetails for Math.E:");
        printNumberDetails(Math.E);

    }
}
