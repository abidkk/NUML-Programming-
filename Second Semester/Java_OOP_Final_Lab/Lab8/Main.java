abstract class Vehicle {
    String model;
    String color;
    String engine;
    int door;

    // Default Constructor
    Vehicle() {
        this.model = "Unknown";
        this.color = "Unknown";
        this.engine = "Unknown";
        this.door = 0;
    }

    // Parameterized Constructor
    Vehicle(String model, String color, String engine, int door) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

    // Method to start the vehicle
    void start() {
        System.out.println(model + " is starting...");
    }

    // Method to stop the vehicle
    void stop() {
        System.out.println(model + " is stopping...");
    }

    // Method to run the vehicle
    void run() {
        System.out.println(model + " is running...");
    }

    // Abstract method to calculate speed
    abstract void calculateSpeed();

    // Method to print vehicle information
    void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Number of Doors: " + door);
    }
}


class Car extends Vehicle {
    // Constructor
    Car(String model, String color, String engine, int door) {
        super(model, color, engine, door);
    }

    // Override the calculateSpeed method
    @Override
    void calculateSpeed() {
        System.out.println("The car's average speed is 120 km/h.");
    }
}


class Bike extends Vehicle {
    // Constructor
    Bike(String model, String color, String engine, int door) {
        super(model, color, engine, door);
    }

    // Override the calculateSpeed method
    @Override
    void calculateSpeed() {
        System.out.println("The bike's average speed is 80 km/h.");
    }
}



public class Main {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        // Create a Car object
        Car car = new Car("Toyota Corolla", "White", "1.8L", 4);
        System.out.println("\nCar Information:");
        car.printInfo();
        car.start();
        car.run();
        car.calculateSpeed();
        car.stop();

        // Create a Bike object
        Bike bike = new Bike("Honda CB150F", "Red", "150cc", 0);
        System.out.println("\nBike Information:");
        bike.printInfo();
        bike.start();
        bike.run();
        bike.calculateSpeed();
        bike.stop();


    }
}
