import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        // Print name and roll number (common statement)
        System.out.println("Name = \"Ali Abid\", Roll No = \"BSCS-KC-006\"");

        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;

        // Display the question and answer choices
        System.out.println("\nQuestion: What is the capital of Pakistan?");
        System.out.println("1) Lahore");
        System.out.println("2) Islamabad");
        System.out.println("3) Karachi");
        System.out.println("4) Peshawar");

        // Correct answer
        int correctAnswer = 2;

        // While loop to prompt the user until they choose the correct answer
        while (userChoice != correctAnswer) {
            System.out.print("\nEnter your choice (1-4): ");
            userChoice = scanner.nextInt();

            if (userChoice == correctAnswer) {
                System.out.println("Correct! The capital of Pakistan is Islamabad.");
            } else {
                System.out.println("Incorrect! Please try again.");
            }
        }


    }
}
