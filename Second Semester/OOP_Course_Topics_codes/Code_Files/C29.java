// File handling in Java
// 2. Reading from a File:

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C29 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file.");
            e.printStackTrace();
        }
    }
}
