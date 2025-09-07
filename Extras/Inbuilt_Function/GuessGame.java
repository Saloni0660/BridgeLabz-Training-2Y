import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int low = 1, high = 100;

            System.out.println("Think of a number between 1 and 100.");
            System.out.println("I will try to guess it. Reply with 'high', 'low', or 'correct'.");

            while (low <= high) {
                int guess = (low + high) / 2;
                System.out.print("Is it " + guess + "? ");
                String response = sc.nextLine().toLowerCase();

                if (response.equals("high")) {
                    high = guess - 1;
                } else if (response.equals("low")) {
                    low = guess + 1;
                } else if (response.equals("correct")) {
                    System.out.println("Yay! I guessed your number: " + guess);
                    break;
                } else {
                    System.out.println("Please enter 'high', 'low', or 'correct'.");
                }
            }

            if (low > high) {
                System.out.println("Oops! Your responses seem inconsistent.");
            }
        }
    }
}
