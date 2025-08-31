import java.util.Scanner;

public class Frequency {

    // Method 1: Find unique characters using charAt() and nested loop
    public static char[] getUniqueCharacters(String text) {
        int length = getLength(text);
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Trim array
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method 2: Count frequencies using ASCII (256 characters)
    public static int[] getCharFrequencies(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        return freq;
    }

    // Method 3: Combine unique characters and their frequencies in 2D String array
    public static String[][] getFrequencyTable(String text) {
        char[] uniqueChars = getUniqueCharacters(text);
        int[] frequencies = getCharFrequencies(text);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequencies[uniqueChars[i]]);
        }

        return result;
    }

    // Method 4: Calculate string length without using length()
    public static int getLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method 5: Display the frequency table
    public static void displayFrequencies(String[][] table) {
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("---------------------------");
        System.out.println("Character\tFrequency");
        System.out.println("---------------------------");

        for (String[] row : table) {
            System.out.println("    " + row[0] + "\t\t    " + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[][] frequencyTable = getFrequencyTable(input);
            displayFrequencies(frequencyTable);
        }
    }
}
