import java.util.Scanner;

public class Index {

    // Method to generate StringIndexOutOfBoundsException (no try-catch)
    public static void generateException(String text) {
        // Accessing an index beyond the length of the string
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            // Attempt to access invalid index
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        // First call method that generates exception (will crash program if uncaught)
        System.out.println("Calling generateException()...");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Then call method that handles the exception internally
        System.out.println("\nCalling handleException()...");
        handleException(input);

        scanner.close();
    }
}
