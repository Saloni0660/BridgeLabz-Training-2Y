import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Variable for height in cm
        double cm;

        // Create Scanner object with try-with-resources (auto closes)
        try (Scanner input = new Scanner(System.in)) {
            // Take user input
            System.out.print("Enter your height in centimeters: ");
            cm = input.nextDouble();

            // Convert cm -> inches
            double totalInches = cm / 2.54;

            // Convert inches -> feet and remaining inches
            int feet = (int) (totalInches / 12);
            int inches = (int) (totalInches % 12);

            // Output
            System.out.println("Your height in cm is: " + cm +
                               "\nwhile in feet it is: " + feet + " ft " + inches + " inches");
        }
    }
}