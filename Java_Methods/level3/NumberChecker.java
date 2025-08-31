public class NumberChecker {

    // a. Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        int num = Math.abs(number); // handle negative numbers
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

    // c. Method to check if a number is a duck number (non-zero digit present)
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // duck number means at least one zero digit but first digit should not be zero
        if (digits[0] == 0) return false; // first digit zero means not duck number
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    // d. Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == Math.abs(number);
    }

    // e. Method to find largest and second largest elements in digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // f. Method to find smallest and second smallest elements in digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 153; // example

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is duck number? " + isDuckNumber(number));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(number));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + smallest[1]);
    }
}
