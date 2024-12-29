// Multi Level Inheritance 

// Grand Parent Class | Base class
class Animal {
    // method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Parent Class
class Dog extends Animal {
    // Method
    void bark() {
        System.out.println("The dog barks.");
    }
}




// Child Class
class BullDog extends Dog {
    // Method
    void dogInfo() {
        System.out.println("This is BullDog");
    }
}



// Main Class
public class C5 {
    public static void main(String[] args) {


        // Creating object from child class
        BullDog d1 = new BullDog();
        
        d1.eat();
        d1.bark();
        d1.dogInfo();


    }
}
