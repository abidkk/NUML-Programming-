// Boxing and Auto-Boxing in Java

public class C25 {
    public static void main(String[] args) {
        // Primitive to wrapper (Boxing)
        int num = 5;
        Integer wrappedNum = Integer.valueOf(num);  // Manual Boxing

        // Auto-boxing (automatic conversion)
        Integer autoBoxedNum = num;  // No need to explicitly use Integer.valueOf

        // Unboxing (wrapper to primitive)
        int unboxedNum = autoBoxedNum;  // Automatically converts to int

        System.out.println("Boxed Integer: " + wrappedNum);
        System.out.println("Auto-boxed Integer: " + autoBoxedNum);
        System.out.println("Unboxed Integer: " + unboxedNum);
    }
}


