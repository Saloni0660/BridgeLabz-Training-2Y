import java.util.Scanner;

public class YardsToMiles {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter distance in feet: ");
            double distanceFeet = input.nextDouble();

            double distanceYards = distanceFeet / 3;          // feet → yards
            double distanceMiles = distanceYards / 1760;      // yards → miles

            System.out.println("\n--- Result ---");
            System.out.println("Distance in yards = " + distanceYards + " yards");
            System.out.println("Distance in miles = " + distanceMiles + " miles");
        }
    }
}