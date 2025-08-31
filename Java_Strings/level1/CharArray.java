import java.util.Scanner;

public class CharArray{

    // Method to extract characters from string using charAt()
    public static char[] getCharsUsingCharAt(String text) {
        int length = text.length();
        char[] result = new char[length];

        for (int i = 0; i < length; i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using user-defined method
        char[] charsFromMethod = getCharsUsingCharAt(input);

        // Get characters using built-in toCharArray()
        char[] charsFromBuiltIn = input.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(charsFromMethod, charsFromBuiltIn);

        // Display results
        System.out.println("\nCharacters using custom method:");
        for (char c : charsFromMethod) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : charsFromBuiltIn) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + areEqual);

        }
    }
}
