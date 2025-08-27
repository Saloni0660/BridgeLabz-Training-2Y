import java.util.Scanner;

public class AgainSum {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a natural no.: ");
            int n = input.nextInt();
            
            if(n >= 1){
                int formulaSum = n*(n+1)/2;

                int loopSum = 0;

                for(int i=1; i<=n; i++){
                    loopSum += i;
                }

                System.out.println("Sum using formula: " + formulaSum);
                System.out.println("Sum using while loop: " + loopSum);

                if (formulaSum == loopSum){
                    System.out.println("Both match. The result is correct.");
                }else{
                    System.out.println("Results do not match. Something is wrong.");
                }
            }else{
                System.out.println("The number " + n + " is not a natural number.");
            }
        }
    }
    
}
