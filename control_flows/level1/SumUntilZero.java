import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            double total = 0.0;
            double num;

            System.out.print("Enter a number (0 to stop): ");
            num = input.nextDouble();

            while (num != 0){
                total += num;

                System.out.print("Enter a number (0 to stop): ");
                num = input.nextDouble();
            }

            System.out.println("The total sum is:" + total);
            
        }
    }
}