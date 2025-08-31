import java.util.Scanner;

public class Illegal{

    // Method that generates IllegalArgumentException (no exception handling)
    public static void generateException(String input) {
        // This will cause IllegalArgumentException because start > end
        String result = input.substring(5, 2);
        System.out.println("Substring: " + result); // This line won't execute
    }

    // Method that catches and handles the exception
    public static void handleException(String input) {
        try {
            // Again, start > end will cause an exception
            String result = input.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        handleException(userInput);

        }
    }
}
