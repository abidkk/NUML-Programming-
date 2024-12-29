//  Interface with Multiple Inheritance

// First interface
interface Engine {
    void startEngine();
}

// Second interface
interface Wheels {
    void rotateWheels();
}

// Third interface
interface Lights {
    void turnOnLights();
}

// A class implementing multiple interfaces
class Car implements Engine, Wheels, Lights {
    @Override
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    @Override
    public void rotateWheels() {
        System.out.println("Wheels are rotating.");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Lights are turned on.");
    }
}

// Main class to test the implementation
public class C12 {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();
        
        // Call methods from multiple interfaces
        myCar.startEngine();
        myCar.rotateWheels();
        myCar.turnOnLights();
    }
}
