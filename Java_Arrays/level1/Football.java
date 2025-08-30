import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] heights = new double[11];  // Array of 11 players
            double sum = 0.0;

            // Taking input for 11 players
            System.out.println("Enter the heights of 11 football players:");
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = input.nextDouble();
                sum += heights[i]; // add directly to sum
            }

            // Calculate mean
            double mean = sum / heights.length;

            // Display mean height
            System.out.println("\nThe mean height of the football team is: " + mean);
        }
    }
}
