import java.util.Scanner;

public class BMI_Calculator {

    // a. Method to take height and weight input for 10 people
    public static double[][] getInputData(Scanner sc, int peopleCount) {
        double[][] data = new double[peopleCount][2]; // [][0] = weight (kg), [][1] = height (cm)

        for (int i = 0; i < peopleCount; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    // b. Method to calculate BMI and return status based on ranges
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to m
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    // c. Method to build 2D String array with Height, Weight, BMI, Status
    public static String[][] buildResultTable(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4]; // Columns: Height, Weight, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);         // Height in cm
            result[i][1] = String.valueOf(weight);         // Weight in kg
            result[i][2] = bmiResult[0];                   // BMI
            result[i][3] = bmiResult[1];                   // Status
        }

        return result;
    }

    // d. Method to display the final scorecard
    public static void displayTable(String[][] table) {
        System.out.println("\nBMI Report:");
        System.out.println("-------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println((i + 1) + "\t" +
                    table[i][0] + "\t\t" +
                    table[i][1] + "\t\t" +
                    table[i][2] + "\t" +
                    table[i][3]);
        }
    }

    // e. Main function
    public static void main(String[] args) {
        final int TOTAL_PERSONS = 10;

        try (Scanner scanner = new Scanner(System.in)) {
            double[][] inputData = getInputData(scanner, TOTAL_PERSONS);
            String[][] resultData = buildResultTable(inputData);
            displayTable(resultData);
        }
    }
}
