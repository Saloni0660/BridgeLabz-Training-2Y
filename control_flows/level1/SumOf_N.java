import java.util.Scanner;

public class SumOf_N{
    public static void main(String[] args){
        try( Scanner input = new Scanner(System.in)){
          
            System.out.print("Enter a no. : ");
            int num = input.nextInt();

            if (num >= 1){
                int sum = num * (num+1) / 2;
                System.out.println("The sum of " + num + " natural numbers is " + sum);
            }else{
                System.out.println("The number " + num + " is not a natural number");

            }
        }
    }
}