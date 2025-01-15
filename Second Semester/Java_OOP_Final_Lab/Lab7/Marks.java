public class Marks extends Department {
    double subject1, subject2, subject3, subject4, subject5;
    double totalMarks = 500; // Assuming total marks for 5 subjects is 500

    // Constructor to initialize marks
    public Marks(String name, int rollNo, String departmentName, double subject1, double subject2, double subject3, double subject4, double subject5) {
        super(name, rollNo, departmentName);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    // Method to calculate total marks
    public double calculateTotal() {
        return subject1 + subject2 + subject3 + subject4 + subject5;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return (calculateTotal() / totalMarks) * 100;
    }

    // Method to calculate average
    public double calculateAverage() {
        return calculateTotal() / 5;
    }

    // Method to display marksheet and calculations
    public void displayMarksheet() {
        displayStudentDetails();
        displayDepartmentDetails();
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);
        System.out.println("Marks in Subject 4: " + subject4);
        System.out.println("Marks in Subject 5: " + subject5);
        System.out.println("Total Marks: " + calculateTotal() + " / " + totalMarks);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
