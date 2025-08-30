import java.util.Scanner;

public class Youngest{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for all 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            height[i] = input.nextDouble();
        }

        // Find youngest
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Print results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + names[minAgeIndex] + " (Age: " + age[minAgeIndex] + ")");
        System.out.println("Tallest Friend: " + names[maxHeightIndex] + " (Height: " + height[maxHeightIndex] + " cm)");
        
        } 
    }
}
