import java.util.Random;
import java.util.Scanner;

public class Voting_Checker {

    // Method 1: Generate random 2-digit age for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate 2-digit age (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method 2: Check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (age >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // Method 3: Display the 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){     

        // Step 1: Take input for number of students (default to 10 if invalid)
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number, defaulting to 10 students.");
            n = 10;
        }

        // Step 2: Generate random ages
        int[] ages = generateAges(n);

        // Step 3: Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Step 4: Display results
        displayResults(results);

        }
    }
}
