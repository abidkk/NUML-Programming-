// 2. Runtime Polymorphism (Method Overriding)
//  when a subclass provides a specific implementation for a method that is already defined in its superclass. The method to be called is determined at runtime based on the object.

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class C8 {
    public static void main(String[] args) {
        Animal myAnimal; // Parent class reference

        // Creating Dog object
        myAnimal = new Dog();
        myAnimal.sound(); // Calls Dog's sound method

        // Creating Cat object
        myAnimal = new Cat();
        myAnimal.sound(); // Calls Cat's sound method
    }
}
