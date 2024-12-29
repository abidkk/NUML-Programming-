// File handling in Java
// 1. Writing to a File:
import java.io.FileWriter;
import java.io.IOException;

public class C28 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("This is a simple file handling example.");
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
            e.printStackTrace();
        }
    }
}
