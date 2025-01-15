public class Main {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Create Marks object and initialize with student, department, and subject marks
        Marks studentMarks = new Marks("Ali Abid", 12345, "Computer Science", 85, 90, 88, 92, 87);

        // Display marksheet
        System.out.println("\nMarksheet:");
        studentMarks.displayMarksheet();

    }
}
