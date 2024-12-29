// Interface

// Define an interface
interface Animal {
    // Abstract methods (no body)
    void eat();
    void sleep();
}

// A class that implements the Animal interface
class Dog implements Animal {
    // Providing implementation for the methods
    @Override
    public void eat() {
        System.out.println("The dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps in a kennel.");
    }
}

class Cat implements Animal {
    // Providing implementation for the methods
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps on the couch.");
    }
}

// Main class to test the code
public class C10 {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the methods
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
