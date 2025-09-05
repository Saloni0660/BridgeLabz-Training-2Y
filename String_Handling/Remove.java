import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != charToRemove) {
                result.append(input.charAt(i));
            }
        }

        System.out.println("Modified String: " + result.toString());

        }
    }
}
