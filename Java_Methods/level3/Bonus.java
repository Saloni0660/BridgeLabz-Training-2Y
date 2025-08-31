import java.util.Random;

public class Bonus {

    // Method to generate salary (5-digit) and years of service randomly for 10 employees
    public static int[][] generateSalaryAndService() {
        int[][] data = new int[10][2];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            // Salary between 10000 and 99999
            data[i][0] = 10000 + rand.nextInt(90000);

            // Years of service between 1 and 15 (arbitrary)
            data[i][1] = 1 + rand.nextInt(15);
        }
        return data;
    }

    // Method to calculate new salary and bonus based on years of service
    // Returns a 2D array where col0 = new salary, col1 = bonus amount
    public static double[][] calculateNewSalaryAndBonus(int[][] oldData) {
        double[][] newData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to calculate sum of old salary, new salary, and total bonus
    public static double[] calculateSums(int[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double sumBonus = 0;

        for (int i = 0; i < 10; i++) {
            sumOldSalary += oldData[i][0];
            sumNewSalary += newData[i][0];
            sumBonus += newData[i][1];
        }

        return new double[]{sumOldSalary, sumNewSalary, sumBonus};
    }

    public static void main(String[] args) {
        int[][] salaryAndService = generateSalaryAndService();
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService);

        System.out.println("Emp\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, salaryAndService[i][0], salaryAndService[i][1],
                    newSalaryAndBonus[i][0], newSalaryAndBonus[i][1]);
        }

        double[] sums = calculateSums(salaryAndService, newSalaryAndBonus);
        System.out.println("\nSummary:");
        System.out.printf("Sum of Old Salary = %.2f\n", sums[0]);
        System.out.printf("Sum of New Salary = %.2f\n", sums[1]);
        System.out.printf("Total Bonus Amount = %.2f\n", sums[2]);
    }
}
