import java.util.Scanner;

public class SmallestNo {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter the first no.: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second no.: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the third no.: ");
            double num3 = input.nextDouble();

            boolean isSmallest = (num1 < num2 && num1 < num3);

            System.out.println("Is the first no. the smallest?" + (isSmallest ? " Yes" : " No"));
            
        }
    }
}