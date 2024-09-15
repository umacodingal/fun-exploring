import java.util.Scanner;

public class shabd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Count characters in the word
        int length = countCharacters(word);
        System.out.println("Number of characters: " + length);

        // Check if the word is a palindrome
        boolean isPalindrome = checkPalindrome(word);
        System.out.println("Is the word a palindrome? " + (isPalindrome ? "Yes" : "No"));

        // Reverse the word
        String reversedWord = reverseWord(word);
        System.out.println("Reversed word: " + reversedWord);

        scanner.close();
    }

    // Method to count the number of characters in a word
    public static int countCharacters(String word) {
        return word.length();
    }

    // Method to check if a word is a palindrome
    public static boolean checkPalindrome(String word) {
        String reversed = reverseWord(word);
        return word.equalsIgnoreCase(reversed);
    }

    // Method to reverse a word
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
