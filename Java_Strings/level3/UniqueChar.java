import java.util.Scanner;

public class UniqueChar { 

    // Method 1: Find string length without using length(), no try-catch
    public static int getLength(String text) {
        char[] temp = text.toCharArray();  // to get array size
        int count = 0;
        for (char c : temp) {
            count++;
        }
        return count;
    }

    // Method 2: Find unique characters using charAt() and loops
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean found = false;

            // Check if this character is already in unique[]
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

        // Create trimmed array of exact uniqueCount size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[] unique = findUniqueCharacters(input);

            System.out.print("Unique characters: ");
            for (char c : unique) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
