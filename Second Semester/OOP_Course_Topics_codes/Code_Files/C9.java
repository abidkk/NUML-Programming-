// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
    
    // Concrete method (has implementation)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass providing implementation for abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class C9 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof Woof
        myDog.eat();       // Output: This animal eats food.
    }
}
