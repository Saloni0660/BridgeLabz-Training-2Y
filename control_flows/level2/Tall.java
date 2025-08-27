import java.util.Scanner;

public class Tall{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Input ages
            System.out.print("Enter Amar's age: ");
            int ageAmar = input.nextInt();
            System.out.print("Enter Akbar's age: ");
            int ageAkbar = input.nextInt();
            System.out.print("Enter Anthony's age: ");
            int ageAnthony = input.nextInt();

            // Input heights
            System.out.print("Enter Amar's height: ");
            int heightAmar = input.nextInt();
            System.out.print("Enter Akbar's height: ");
            int heightAkbar = input.nextInt();
            System.out.print("Enter Anthony's height: ");
            int heightAnthony = input.nextInt();

            // Find youngest
            if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
                System.out.println("Youngest friend is Amar with age " + ageAmar);
            } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
                System.out.println("Youngest friend is Akbar with age " + ageAkbar);
            } else {
                System.out.println("Youngest friend is Anthony with age " + ageAnthony);
            }

            // Find tallest
            if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
                System.out.println("Tallest friend is Amar with height " + heightAmar);
            } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
                System.out.println("Tallest friend is Akbar with height " + heightAkbar);
            } else {
                System.out.println("Tallest friend is Anthony with height " + heightAnthony);
            }
        }
    }
}
