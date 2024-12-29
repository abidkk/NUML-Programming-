// Collections in Java
// 2. HashSet (Set - stores unique values):

import java.util.HashSet;

public class C27 {
    public static void main(String[] args) {
        HashSet<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Duplicate will be ignored

        System.out.println("HashSet (Unique): " + uniqueFruits);
    }
}
