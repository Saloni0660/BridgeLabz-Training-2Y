import java.util.Scanner;

public class Upper{

    // Method to convert text to uppercase using ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);  // Convert lowercase to uppercase
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        // Step 1: Take user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Step 2: Convert using built-in method
        String builtInUpper = inputText.toUpperCase();

        // Step 3: Convert using user-defined method
        String customUpper = convertToUpperCase(inputText);

        // Step 4: Compare both strings
        boolean areEqual = compareStrings(builtInUpper, customUpper);

        // Step 5: Display results
        System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
        System.out.println("Custom converted text: " + customUpper);
        System.out.println("Are both strings equal? " + areEqual);

        }
    }
}
