import java.util.Arrays;

public class AgainNC {

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

    // a. Method to store the digits of the number in an array
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

    // b. Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // c. Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // d. Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // e. Method to check if a number is a duck number
    // Duck number has a non-zero digit present in it (ignoring leading zeros)
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test all methods
    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 12345;

        System.out.println("Count digits: " + countDigits(number1));
        
        int[] digits = storeDigits(number1);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed array: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Arrays equal? " + arraysEqual(digits, reversed));
        System.out.println(number1 + " is palindrome? " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome? " + isPalindrome(number2));

        System.out.println(number1 + " is duck number? " + isDuckNumber(number1));
        System.out.println("000123 is duck number? " + isDuckNumber(123)); // leading zeros ignored in int
        System.out.println("0 is duck number? " + isDuckNumber(0)); // no non-zero digit
    }
}
