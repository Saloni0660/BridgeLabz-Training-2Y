import java.util.Scanner;

public class Mtrix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Step 1: Take user input for rows and columns
            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = input.nextInt();

            // Step 2: Create 2D array
            int[][] matrix = new int[rows][cols];

            System.out.println("\nEnter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = input.nextInt();
                }
            }

            // Step 3: Create 1D array
            int[] array = new int[rows * cols];
            int index = 0;

            // Step 4: Copy elements from 2D to 1D
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }

            // Step 5: Display 2D matrix
            System.out.println("\n2D Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Step 6: Display 1D array
            System.out.println("\nConverted 1D Array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
