public class Null_Pointer {

    // Class-level variable initialized to null
    static String message = null;

    // Method that causes NullPointerException
    public static void causeException() {
        // Will throw NullPointerException when trying to call toUpperCase() on null
        System.out.println("Message in uppercase: " + message.toUpperCase());
    }

    // Method that handles the exception gracefully
    public static void handleNullPointer() {
        try {
            // Attempting to use a method on a null object
            System.out.println("Message in uppercase: " + message.toUpperCase());
        } catch (NullPointerException e) {
            // Exception caught and handled here
            System.out.println("Caught a NullPointerException in handleNullPointer()");
        }
    }

    public static void main(String[] args) {
        // 1. First demonstrate the exception (Uncomment to see the exception)
        // causeException();  // This will crash the program

        // 2. Handle the exception gracefully
        handleNullPointer();
    }
}
