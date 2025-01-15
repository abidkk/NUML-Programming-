public class Department extends Student {
    String departmentName;

    // Constructor to initialize department details
    public Department(String name, int rollNo, String departmentName) {
        super(name, rollNo);
        this.departmentName = departmentName;
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
    }
}
