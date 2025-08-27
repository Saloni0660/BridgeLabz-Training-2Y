import java.util.Scanner;

public class FactorWhile{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a positive no.: ");
            int num = input.nextInt();

            if(num<=0){
                System.out.println("Please enter a positive number.");
            }else{
                System.out.println("Factors of "+ num + " are:");

                int counter = 1;
                while(counter<=num){
                    if(num%counter==0){
                        System.out.println(counter);
                    }
                    counter++;
                }
            }
        }
    }    
}
