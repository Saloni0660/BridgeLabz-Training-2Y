import java.util.Scanner;

public class Substring{

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
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
            

        // Input original text and start/end indexes
        System.out.print("Enter the original string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Substring using custom method with charAt()
        String substringCharAt = createSubstringUsingCharAt(text, start, end);

        // Substring using built-in substring() method
        String substringBuiltIn = "";
        if (start >= 0 && end <= text.length() && start < end) {
            substringBuiltIn = text.substring(start, end);
        }

        // Compare both substrings
        boolean isEqual = compareStringsUsingCharAt(substringCharAt, substringBuiltIn);

        // Display results
        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in method: " + substringBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        }
    }
}
