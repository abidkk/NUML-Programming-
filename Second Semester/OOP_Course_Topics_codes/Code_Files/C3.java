//  Class , Attributes , Constructor, Method, Object

class Car{
    // Attributes
    int seats = 2;
    String color ;

    // Constructor 
    Car( String color){
        // this.seats = seats;
        this.color = color;

    }

    // Method
    void carInfo(){
        System.out.println("The car is "  + color + " having " + seats + " seats");
    }

}


// Main class
public class C3{
    public static void main(String[]args){

        // Creating Object
        Car c1 = new Car( "black");
        Car c2 = new Car( "white");
        Car c3 = new Car( "red");

    // calling method
    c1.carInfo();
    c2.carInfo();
    c3.carInfo();

    }
}