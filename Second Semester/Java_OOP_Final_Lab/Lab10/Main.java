import java.util.Scanner;

interface IShape {
    void SName(); // Method to input the name of the shape
    void ShArea(); // Method to calculate and display the area of the shape
}


class ShapeCalculator implements IShape {
    private String shapeName;

    // Method to input the name of the shape
    @Override
    public void SName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the shape (Circle, Rectangle, Triangle): ");
        shapeName = scanner.nextLine();
    }

    // Method to calculate and display the area of the shape
    @Override
    public void ShArea() {
        Scanner scanner = new Scanner(System.in);
        double area = 0;

        if (shapeName.equalsIgnoreCase("Circle")) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = Math.PI * radius * radius;
            System.out.printf("The area of the Circle is: %.2f\n", area);
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            area = length * width;
            System.out.printf("The area of the Rectangle is: %.2f\n", area);
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            area = 0.5 * base * height;
            System.out.printf("The area of the Triangle is: %.2f\n", area);
        } else {
            System.out.println("Invalid shape name entered!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Create an object of ShapeCalculator
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        // Input shape name and calculate area
        shapeCalculator.SName();
        shapeCalculator.ShArea();


    }
}
