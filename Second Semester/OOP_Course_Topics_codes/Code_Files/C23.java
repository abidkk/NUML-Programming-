// Enums in Java

// Define an enum for days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class C23 {
    public static void main(String[] args) {
        Day today = Day.MONDAY; // Assigning an enum value
        System.out.println("Today is: " + today);
    }
}
