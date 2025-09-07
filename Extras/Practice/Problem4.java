import java.time.LocalDate;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String input1 = sc.nextLine();

            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String input2 = sc.nextLine();

            // Convert strings to LocalDate
            LocalDate date1 = LocalDate.parse(input1);
            LocalDate date2 = LocalDate.parse(input2);

            // Compare the two dates
            if (date1.isBefore(date2)) {
                System.out.println("The first date is BEFORE the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is AFTER the second date.");
            } else {
                System.out.println("Both dates are EQUAL.");
            }

        } catch (Exception e) {
            System.out.println("Invalid date input. Please enter in yyyy-MM-dd format.");
        }
    }
}
