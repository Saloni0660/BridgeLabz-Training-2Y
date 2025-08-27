import java.util.Scanner;

public class FactorsOfNums{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a positive no.: ");
            int num = input.nextInt();

            if(num<=0){
                System.out.println("Please enter a positive number.");
            }else{
                System.out.println("Factors of "+ num + " are:");

                for(int i=1; i<= num; i++){
                    if(num%i==0){
                        System.out.println(i);
                    }
                }
            }
        }
    }    
}
