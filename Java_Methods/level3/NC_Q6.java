public class NC_Q6 {

    // a. Method to check if a number is perfect
    // Perfect number: sum of its proper divisors equals the number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // b. Method to check if a number is abundant
    // Abundant number: sum of proper divisors > number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // c. Method to check if a number is deficient
    // Deficient number: sum of proper divisors < number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // d. Method to check if a number is strong
    // Strong number: sum of factorial of digits equals the number itself
    public static boolean isStrong(int number) {
        int sum = 0;
        int num = number;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 8, 145, 28};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is Perfect? " + isPerfect(number));
            System.out.println("Is Abundant? " + isAbundant(number));
            System.out.println("Is Deficient? " + isDeficient(number));
            System.out.println("Is Strong? " + isStrong(number));
            System.out.println();
        }
    }
}
