import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanedInput = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";
        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed += cleanedInput.charAt(i);
        }

        if (cleanedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        }
    }
}
