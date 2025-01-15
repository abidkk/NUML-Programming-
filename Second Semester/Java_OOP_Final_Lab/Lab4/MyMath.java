public class MyMath {
    // Static method to round a double to the nearest 100th
    public static double roundToNearest100th(double number) {
        return Math.round(number * 100) / 100.0;
    }
}