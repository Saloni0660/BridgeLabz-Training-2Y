import java.util.Scanner;

public class VoteChecker {

    // Method to check if a student can vote based on age
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
        int[] ages = new int[10];

        // Take input for 10 students
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check and display if each student can vote
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote.");
            }
        }

        }
    }
}
