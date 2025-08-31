import java.util.Random;
import java.util.Scanner;

public class ScoreCard {

    // Method a: Generate random scores for Physics, Chemistry, Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Random score between 60 and 100
            }
        }

        return scores;
    }

    // Method b: Calculate total, average, percentage for each student
    public static double[][] calculatePerformance(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method c: Determine grade based on percentage
    public static String[] calculateGrades(double[][] performance) {
        int n = performance.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percentage = performance[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method d: Display scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] performance, String[] grades) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\t%age\tGrade");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) performance[i][0] + "\t" +
                    performance[i][1] + "\t" +
                    performance[i][2] + "%\t" +
                    grades[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] performance = calculatePerformance(scores);
        String[] grades = calculateGrades(performance);

        displayScorecard(scores, performance, grades);

        }
    }
}
