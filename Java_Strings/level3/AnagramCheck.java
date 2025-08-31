import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for ASCII characters (256)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Find frequencies
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Step 4: Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first text: ");
            String text1 = scanner.nextLine();

            System.out.print("Enter second text: ");
            String text2 = scanner.nextLine();

            boolean result = areAnagrams(text1, text2);

            if (result) {
                System.out.println("\n\"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
            } else {
                System.out.println("\n\"" + text1 + "\" and \"" + text2 + "\" are NOT anagrams.");
            }
        }
    }
}
