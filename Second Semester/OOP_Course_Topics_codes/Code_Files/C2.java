//  class with Method and Object 

class Car{
   
    // Method
    void carColor(){
        System.out.println("The car is gray");
    }
    // Method 2
    void carModel(){
        System.out.println("Model: 2024" );
    }

}


// Main class
public class C2{
    public static void main(String[] args) {
        
        //  Object creating 
        Car c1 = new Car();


        c1.carColor();

        c1.carModel();
    }
}