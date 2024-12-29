// Encapsulation 
// Access Modifiers: Default, Public, Private, Protected
//  Getter & Setters

class Book{
    // Attribute
    int pages = 250;
    public String title = "The Compund Effect";
    public String author = "Darren Hardy";
    protected String type = "Hard copy";
    private int price ; // cannot be used in same packege

    // Method
    void bookInfo(){
        System.err.println("Book Title is:" + title);
    }



       // Getter for private attribute
       public int getPrice() {
        return price;
    }
}


// new class
class SelfHelp{

    // method
    void getNewInro(Book book){
        System.err.println("Book Title: " + book.title);
        System.err.println("Book Author: " + book.author);
        System.err.println("Book pages: " + book.pages);
        System.err.println("Book Price: " + book.getPrice()); //
        System.err.println("Book Type: " + book.type);
    }
}




public class C6{
    public static void main(String[] args) {
        
        Book b1 = new Book();
        b1.bookInfo();


        SelfHelp sh1 = new SelfHelp();
        sh1.getNewInro(b1);
   }
}

