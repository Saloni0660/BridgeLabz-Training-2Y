import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter positive no. : ");
            int n = input.nextInt();

            if (n<0){
                System.out.println("Factorial is not defined for negative no.s");
            }else{
                long factorial = 1;
                int i = 1;

                while (i<=n){
                    factorial *= i;
                    i++;
                }

                System.out.println("The factorial of " + n + " is: " + factorial );
            }
        }
    }
}