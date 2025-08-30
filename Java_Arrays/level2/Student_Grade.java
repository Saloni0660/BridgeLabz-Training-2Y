import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        // Create scanner object
        try(Scanner sc = new Scanner(System.in)){

            

            // Input marks for three subjects
            System.out.print("Enter marks for Physics: ");
            double physics = sc.nextDouble();
            
            System.out.print("Enter marks for Chemistry: ");
            double chemistry = sc.nextDouble();
            
            System.out.print("Enter marks for Maths: ");
            double maths = sc.nextDouble();
            
            // Calculate total marks and percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300) * 100;  // Out of 300 marks
            
            // Display total marks and percentage
            System.out.println("\nTotal Marks: " + totalMarks + "/300");
            System.out.println("Percentage: " + percentage + "%");
            
            // Calculate grade based on the percentage
            if (percentage >= 80) {
                System.out.println("Grade: A (Level 4, above agency-normalized standards)");
            } else if (percentage >= 70) {
                System.out.println("Grade: B (Level 3, at agency-normalized standards)");
            } else if (percentage >= 60) {
                System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
            } else if (percentage >= 50) {
                System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
            } else if (percentage >= 40) {
                System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
            } else {
                System.out.println("Grade: R (Remedial standards)");
            }
        }
            
    }
}
