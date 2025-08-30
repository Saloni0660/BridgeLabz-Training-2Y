import java.util.Scanner;

public class Person_BMI {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // Step 1: Take number of persons
            System.out.print("Enter number of persons: ");
            int number = input.nextInt();

            // Step 2: Create arrays
            double[][] personData = new double[number][3]; // [i][0] = height, [i][1] = weight, [i][2] = BMI
            String[] weightStatus = new String[number];

            // Step 3: Take input for each person
            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter details for Person " + (i + 1));

                // Height
                double height;
                while (true) {
                    System.out.print("Enter height in meters: ");
                    height = input.nextDouble();
                    if (height > 0) break; 
                    System.out.println(" Height must be positive. Try again.");
                }

                // Weight
                double weight;
                while (true) {
                    System.out.print("Enter weight in kg: ");
                    weight = input.nextDouble();
                    if (weight > 0) break; 
                    System.out.println(" Weight must be positive. Try again.");
                }

                // Store height & weight
                personData[i][0] = height;
                personData[i][1] = weight;

                // Step 4: Calculate BMI = weight / (height * height)
                double bmi = weight / (height * height);
                personData[i][2] = bmi;

                // Step 5: Determine weight status
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 24.9) {
                    weightStatus[i] = "Normal";
                } else if (bmi < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            // Step 6: Display results
            System.out.println("\n--- BMI Report ---");
            for (int i = 0; i < number; i++) {
                System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                        (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }
        }
    }
}
