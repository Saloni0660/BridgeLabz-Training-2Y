public class AdvancedNC {

    // a. Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        int num = Math.abs(number);
        if (num == 0) return 1;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // b. Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int num = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // c. Method to find the sum of the digits of a number using the digits array
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // d. Method to find the sum of squares of the digits of a number using Math.pow()
    public static int sumSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // e. Method to check if a number is a Harshad number
    // Harshad number: divisible by the sum of its digits
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumDigits(digits);
        return (sum != 0) && (number % sum == 0);
    }

    // f. Method to find the frequency of each digit in the number
    // Returns a 2D array: [digit, frequency]
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] freq = new int[10]; // digits 0 to 9

        for (int digit : digits) {
            freq[digit]++;
        }

        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        int[][] result = new int[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 1729;

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares of digits: " + sumSquaresOfDigits(digits));
        System.out.println("Is Harshad number? " + isHarshadNumber(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] pair : freq) {
            System.out.println("Digit " + pair[0] + ": " + pair[1] + " time(s)");
        }
    }
}
