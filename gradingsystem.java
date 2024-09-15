import java.util.Scanner;

public class gradingsystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else {
            String grade = getGrade(score);
            System.out.println("The grade for the score " + score + " is: " + grade);
        }

        scanner.close();
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A (Excellent)";
        } else if (score >= 80) {
            return "B (Good)";
        } else if (score >= 70) {
        }
    }
