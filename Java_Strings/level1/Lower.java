import java.util.Scanner;

public class Lower{

    // Method to convert uppercase letters to lowercase using ASCII values
    public static String convertToLowerUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char)(ch + 32);
            }

            result += ch; // Append to result string
        }

        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        // Get full line input
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Convert using custom method
        String lowerCustom = convertToLowerUsingCharAt(inputText);

        // Convert using built-in toLowerCase() method
        String lowerBuiltIn = inputText.toLowerCase();

        // Compare both lowercase strings
        boolean areEqual = compareStrings(lowerCustom, lowerBuiltIn);

        // Display results
        System.out.println("\nLowercase using custom method: " + lowerCustom);
        System.out.println("Lowercase using built-in method: " + lowerBuiltIn);
        System.out.println("Are both lowercase results equal? " + areEqual);


        }
    }
}
