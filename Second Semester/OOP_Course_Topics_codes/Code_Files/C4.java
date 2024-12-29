
//  Single Level Inheritance
//  Parent | Base Class
class Animal {
    // method
    void eat() {
        System.out.println("This animal eats food.");
    }
}


// // Child 1
// Child class and extend class | Sub class
class Dog extends Animal {
    // Method
    void bark() {
        System.out.println("The dog barks.");
    }
}

// // Child 2
// Child class and extend class | Sub class
class Cat extends Animal {
    // Method
    void meow() {
        System.out.println("The cat says Meow.");
    }
}



// Inheritance : Single Level Inheriance
public class C4 {
    public static void main(String[] args) {

        // creating object
        Dog dog1 = new Dog();
        dog1.eat();  // Inherited from Animal
        dog1.bark(); // Defined in Dog


        //  Creating cat instance
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.meow();

        // Parent object
        Animal a1 = new Animal();
        a1.eat();


    }
}
