import java.util.Scanner;

public class NumCheck{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a no. :");
            int num = input.nextInt();

            if (num > 0){
                System.out.println("The number is positive.");
            }else if (num < 0){
                System.out.println("The number is negative.");
            }else{
                System.out.println("The number is zero.");
            }

        }
    }
}