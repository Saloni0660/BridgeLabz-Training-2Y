import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
 // Arrays
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Totals
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Input salaries and years
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = input.nextDouble();

            System.out.print("Years of Service: ");
            double yrs = input.nextDouble();

            // Validation
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement to re-enter data for same employee
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5%
            } else {
                bonus[i] = salary[i] * 0.02;  // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Company Bonus Summary (Zara) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                               ": Old Salary = " + salary[i] +
                               ", Bonus = " + bonus[i] +
                               ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        } 
    }
}
