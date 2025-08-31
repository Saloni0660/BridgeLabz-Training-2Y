import java.util.Scanner;

public class Length {

    // Method to find string length without using length() or exceptions
    public static int getStringLength(String text) {
        char[] chars = text.toCharArray();  // Convert string to character array
        int count = 0;

        // Count characters in array
        for (char c : chars) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Take input from the user
            System.out.print("Enter a word: ");
            String input = scanner.next();  // Using next() to take a single word

            // Call user-defined method
            int manualLength = getStringLength(input);

            // Use built-in method for comparison
            int builtinLength = input.length();

            // Display both results
            System.out.println("\nManual calculated length: " + manualLength);
            System.out.println("Built-in length(): " + builtinLength);

        }
    }
}
