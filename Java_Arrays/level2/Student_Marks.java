import java.util.Scanner;

public class Student_Marks {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Step 1: Number of students
            System.out.print("Enter number of students: ");
            int number = input.nextInt();

            // Step 2: Create arrays
            double[][] marks = new double[number][3];  // [i][0] = Physics, [i][1] = Chemistry, [i][2] = Maths
            double[] percentage = new double[number];
            String[] grade = new String[number];

            // Step 3: Input marks for each student
            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1));

                // Physics
                double physics;
                while (true) {
                    System.out.print("Physics: ");
                    physics = input.nextDouble();
                    if (physics >= 0 && physics <= 100) break;
                    System.out.println("❌ Marks must be between 0 and 100. Try again.");
                }

                // Chemistry
                double chemistry;
                while (true) {
                    System.out.print("Chemistry: ");
                    chemistry = input.nextDouble();
                    if (chemistry >= 0 && chemistry <= 100) break;
                    System.out.println("❌ Marks must be between 0 and 100. Try again.");
                }

                // Maths
                double maths;
                while (true) {
                    System.out.print("Maths: ");
                    maths = input.nextDouble();
                    if (maths >= 0 && maths <= 100) break;
                    System.out.println("❌ Marks must be between 0 and 100. Try again.");
                }

                // Store in 2D array
                marks[i][0] = physics;
                marks[i][1] = chemistry;
                marks[i][2] = maths;

                // Step 4: Calculate percentage
                double total = physics + chemistry + maths;
                percentage[i] = total / 3.0;

                // Step 5: Assign grade
                if (percentage[i] >= 90) {
                    grade[i] = "A";
                } else if (percentage[i] >= 75) {
                    grade[i] = "B";
                } else if (percentage[i] >= 50) {
                    grade[i] = "C";
                } else {
                    grade[i] = "F";
                }
            }

            // Step 6: Display results
            System.out.println("\n--- Student Report ---");
            for (int i = 0; i < number; i++) {
                System.out.printf("Student %d -> Physics: %.1f, Chemistry: %.1f, Maths: %.1f, Percentage: %.2f%%, Grade: %s\n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }
        }
    }
}
