public class NC_Q5 {

    // a. Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // b. Method to check if a number is a neon number
    // Neon number: sum of digits of square of the number equals the number itself
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // c. Method to check if a number is a spy number
    // Spy number: sum of digits equals product of digits
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int num = number;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // d. Method to check if a number is automorphic
    // Automorphic: square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNum = String.valueOf(number);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNum);
    }

    // e. Method to check if a number is a buzz number
    // Buzz number: divisible by 7 or ends with 7
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // Main method to test above methods
    public static void main(String[] args) {
        int[] testNumbers = {7, 9, 153, 25, 5, 14, 17, 1729};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is Prime? " + isPrime(number));
            System.out.println("Is Neon? " + isNeon(number));
            System.out.println("Is Spy? " + isSpy(number));
            System.out.println("Is Automorphic? " + isAutomorphic(number));
            System.out.println("Is Buzz? " + isBuzz(number));
            System.out.println();
        }
    }
}
