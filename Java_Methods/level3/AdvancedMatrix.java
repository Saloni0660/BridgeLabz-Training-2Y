import java.util.Random;

public class AdvancedMatrix {

    // Method to create a random matrix with given rows and cols
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose of matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2)
            throw new IllegalArgumentException("Matrix must be 2x2");
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        if (m.length != 3 || m[0].length != 3)
            throw new IllegalArgumentException("Matrix must be 3x3");
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    // Helper method to get minor of 3x3 matrix at given row and col
    private static double[][] getMinor(double[][] matrix, int row, int col) {
        double[][] minor = new double[2][2];
        int r = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }
        return minor;
    }

    // Cofactor matrix of 3x3
    private static double[][] cofactorMatrix3x3(double[][] matrix) {
        double[][] cofactors = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double[][] minor = getMinor(matrix, i, j);
                cofactors[i][j] = Math.pow(-1, i + j) * determinant2x2(minor);
            }
        }
        return cofactors;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");

        double[][] cofactors = cofactorMatrix3x3(matrix);
        double[][] adjoint = transpose(cofactors);

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    public static void main(String[] args) {
        // Generate random 3x3 matrix
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 matrix:");
        displayMatrix(matrix3x3);

        // Transpose
        double[][] transposed = transpose(matrix3x3);
        System.out.println("\nTranspose:");
        displayMatrix(transposed);

        // Determinant 3x3
        double det3x3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant (3x3): " + det3x3);

        // Inverse 3x3 if possible
        try {
            double[][] inv3x3 = inverse3x3(matrix3x3);
            System.out.println("\nInverse (3x3):");
            displayMatrix(inv3x3);
        } catch (ArithmeticException e) {
            System.out.println("\nInverse (3x3): " + e.getMessage());
        }

        // Generate random 2x2 matrix
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("\nOriginal 2x2 matrix:");
        displayMatrix(matrix2x2);

        // Determinant 2x2
        double det2x2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant (2x2): " + det2x2);

        // Inverse 2x2 if possible
        try {
            double[][] inv2x2 = inverse2x2(matrix2x2);
            System.out.println("\nInverse (2x2):");
            displayMatrix(inv2x2);
        } catch (ArithmeticException e) {
            System.out.println("\nInverse (2x2): " + e.getMessage());
        }
    }
}
