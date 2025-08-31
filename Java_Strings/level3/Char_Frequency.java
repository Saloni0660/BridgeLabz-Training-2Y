import java.util.Scanner;

public class Char_Frequency {

    // Method to calculate character frequencies using charAt()
    public static String[][] getCharFrequencies(String text) {
        int[] freq = new int[256]; // ASCII table (0-255)

        // Step 1: Count frequency of each character
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Determine unique characters and their frequencies
        int length = getLength(text);
        boolean[] visited = new boolean[256];
        String[][] result = new String[length][2]; // Max possible = length of input
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
            }
        }

        // Step 3: Trim the result array to exact number of unique characters
        String[][] trimmedResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            trimmedResult[i][0] = result[i][0];
            trimmedResult[i][1] = result[i][1];
        }

        return trimmedResult;
    }

    // Utility method to get string length without using length()
    public static int getLength(String text) {
        char[] arr = text.toCharArray();
        int count = 0;
        for (char c : arr) {
            count++;
        }
        return count;
    }

    // Display result in tabular format
    public static void displayFrequencies(String[][] frequencies) {
        System.out.println("\nCharacter Frequencies:");
        System.out.println("--------------------------");
        System.out.println("Character\tFrequency");
        System.out.println("--------------------------");

        for (String[] row : frequencies) {
            System.out.println("    " + row[0] + "\t\t    " + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[][] charFrequencies = getCharFrequencies(input);
            displayFrequencies(charFrequencies);
        }
    }
}
