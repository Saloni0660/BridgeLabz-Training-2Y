import java.util.Scanner;

public class Array_Index{

    // Method that generates ArrayIndexOutOfBoundsException (no handling)
    public static void generateException(String[] names, int index) {
        // This will throw ArrayIndexOutOfBoundsException if index is out of bounds
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    // Method that handles the exception using try-catch
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};

        // Display available indexes
        System.out.println("Available indexes: 0 to " + (names.length - 1));

        // Take index input from the user
        System.out.print("Enter an index to access: ");
        int userIndex = scanner.nextInt();

        // Call the method that generates the exception (uncomment to test crash)
        // generateException(names, userIndex);

        // Call the method that handles the exception
        handleException(names, userIndex);

        }
    }
}
