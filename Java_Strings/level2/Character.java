import java.util.Scanner;

public class Character {

    // Method to convert uppercase to lowercase using ASCII values
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // ASCII difference between uppercase and lowercase
        }
        return ch;
    }

    // Method to check character type: Vowel, Consonant, or Not a Letter
    public static String getCharacterType(char ch) {
        ch = toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze characters in the string and return 2D array
    public static String[][] analyzeCharacters(String text) {
        int length = 0;

        // Get length using charAt() in a try-catch loop
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached end of string
        }

        // Create 2D array to store character and its type
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayCharacterTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "\t\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Analyze characters
        String[][] analysis = analyzeCharacters(input);

        // Display result
        displayCharacterTable(analysis);

        }
    }
}
