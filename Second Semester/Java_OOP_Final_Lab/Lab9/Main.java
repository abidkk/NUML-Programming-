public class Main {
    // Method to print array elements
    static void printArray(String[] array) {
        System.out.println("Array Elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Initialize a string array
        String[] stringArray = {"Java", "Python", "C++", "JavaScript", "Django"};

        // Call the printArray method and pass the array
        printArray(stringArray);

    }
}
