import java.util.Scanner;

public class NestedLoop {

    // Method to find character frequencies using nested loops
    public static String[] getFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Outer loop: Go through each character
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            // Skip already visited/marked characters
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark as counted
                }
            }
        }

        // Count how many non-zero characters (not marked as duplicate)
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create result array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[] frequencies = getFrequencies(input);

            // Display result
            System.out.println("\nCharacter Frequencies:");
            System.out.println("-----------------------");
            for (String s : frequencies) {
                System.out.println(s);
            }
        }
    }
}
