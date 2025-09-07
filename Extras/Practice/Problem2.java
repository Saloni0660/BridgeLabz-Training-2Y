import java.time.LocalDate;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a date (yyyy-MM-dd): ");
            String input = sc.nextLine();

            LocalDate date = LocalDate.parse(input);

            LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

            LocalDate finalDate = addedDate.minusWeeks(3);

            System.out.println("Final date after operations: " + finalDate);
        }
    }
}
