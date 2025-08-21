import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // a. Create a variable km
        double km;

        // b. Create Scanner with try-with-resources
        try (Scanner input = new Scanner(System.in)) {
            // c. Take user input for km
            System.out.print("Enter distance in kilometers: ");
            km = input.nextInt();

            // d. Convert km to miles (1 mile = 1.6 km)
            double miles = km / 1.6;

            // Output
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        }
    }
}