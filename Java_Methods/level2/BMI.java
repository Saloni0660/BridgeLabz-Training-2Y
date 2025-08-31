import java.util.Scanner;

public class BMI {

    // Method to calculate BMI for each person
    public static double[][] calculateBMI(double[][] data) {
        // data array: 10 rows, 3 columns (weight, height, BMI)
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // in kg
            double heightCm = data[i][1]; // in cm
            double heightM = heightCm / 100.0; // convert to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
        return data;
    }

    // Method to determine BMI status for each BMI value
    public static String[] determineBMIStatus(double[] bmiValues) {
        String[] status = new String[bmiValues.length];
        for (int i = 0; i < bmiValues.length; i++) {
            double bmi = bmiValues[i];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        // 10 persons, each with weight, height, and BMI
        double[][] personData = new double[10][3]; // [weight, height, BMI]

        // Taking input for weight (kg) and height (cm)
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(personData);

        // Extract BMI values for status determination
        double[] bmiValues = new double[10];
        for (int i = 0; i < 10; i++) {
            bmiValues[i] = personData[i][2];
        }

        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(bmiValues);

        // Print the results
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", i + 1, personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        }
    }
}
