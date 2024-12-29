// Interfaces, defining an interface, implementing and applying interfaces, Variables in interfaces,

// Defining an interface
interface Vehicle {
    // Abstract methods
    void start();
    void stop();
    
    // Variables in interfaces (implicitly public, static, and final)
    int MAX_SPEED = 120; 
}

// Class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Another class implementing the Vehicle interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

// Main class to test the implementation
public class C11 {
    public static void main(String[] args) {
        // Polymorphic usage of interfaces
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.start();
        myCar.stop();
        
        myBike.start();
        myBike.stop();
        
        // Accessing interface variables
        System.out.println("Maximum Speed for Vehicles: " + Vehicle.MAX_SPEED + " km/h");
    }
}
