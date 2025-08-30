import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Step 1: Get user input
            System.out.print("Enter a natural number: ");
            int number = input.nextInt();

            // Step 2: Check if it's a natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a natural number greater than 0.");
                return;
            }

            // Step 3: Create arrays for odd and even numbers
            int size = number / 2 + 1;
            int[] odd = new int[size];
            int[] even = new int[size];

            // Step 4: Create index variables
            int oddIndex = 0, evenIndex = 0;

            // Step 5: Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }

            // Step 6: Print odd numbers
            System.out.println("\nOdd Numbers:");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }

            // Print even numbers
            System.out.println("\nEven Numbers:");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
        }
    }
}
