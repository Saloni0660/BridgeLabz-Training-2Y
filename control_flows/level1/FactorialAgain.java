import java.util.Scanner;

public class FactorialAgain{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter positive no. : ");
            int n = input.nextInt();

            if (n<0){
                System.out.println("Factorial is not defined for negative no.s");
            }else{
                long factorial = 1;
                
                for (int i = 1; i <= n; i++){
                    factorial *= i;
                }

                System.out.println("The factorial of " + n + " is: " + factorial );
            }
        }
    }
}