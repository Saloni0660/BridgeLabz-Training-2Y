import java.util.Scanner;

public class My_String {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // Characters not equal
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            

        // Take user input using next()
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Compare using charAt()
        boolean charAtResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals()
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Check if both methods give the same result
        if (charAtResult == equalsResult) {
            System.out.println("Both methods gave the same result.");
        } else {
            System.out.println("Methods gave different results.");
        }

        }
    }
}
