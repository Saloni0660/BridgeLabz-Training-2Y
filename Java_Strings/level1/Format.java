import java.util.Scanner;

public class Format {

    // Method that generates NumberFormatException (no exception handling)
    public static void generateException(String input) {
        // This line will throw NumberFormatException if input is not a number
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number); // Will not execute if exception occurs
    }

    // Method that handles NumberFormatException and RuntimeException
    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
        // Take input from the user
        System.out.print("Enter a number (as string): ");
        String userInput = scanner.nextLine();

        handleException(userInput);

        }
    }
}
