// Compile-Time Polymorphism (Method Overloading)
// when a class has multiple methods with the same name but different parameter lists. The method that gets called depends on the arguments passed.
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class C7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 10)); // Calls the 1st method
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15)); // Calls the 2nd method
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5)); // Calls the 3rd method
    }
}
