import java.util.Scanner;

public class Palindrome {

    // Logic 1: Iterative method to check palindrome using charAt()
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper Method: Reverse string using charAt() and return char array
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a text to check palindrome: ");
            String input = scanner.nextLine();

            System.out.println("\nResults:");
            System.out.println("---------");
            System.out.println("Iterative check: " + (isPalindromeIterative(input) ? "Palindrome" : "Not Palindrome"));
            System.out.println("Recursive check: " + (isPalindromeRecursive(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome"));
            System.out.println("Array check: " + (isPalindromeUsingArrays(input) ? "Palindrome" : "Not Palindrome"));
        }
    }
}
