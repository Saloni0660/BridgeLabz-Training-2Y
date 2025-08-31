import java.util.Scanner;

public class Non_Repeating {

    // Method to find the first non-repeating character using charAt()
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII character frequency array

        // Step 1: Count frequency of each character
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character
    }

    // Method to get string length without using length()
    public static int getLength(String text) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char result = findFirstNonRepeatingChar(input);

            if (result != '\0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
    }
}
