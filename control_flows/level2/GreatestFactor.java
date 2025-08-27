import java.util.Scanner;

public class GreatestFactor{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a positive no.: ");
            int num = input.nextInt();

            if(num<=1){
                System.out.println("Please enter an integer greater than 1.");
            }else{
                int greatestFactor=1;

                for(int i=num-1; i>=1; i++){
                    if(num%i==0){
                        greatestFactor=i;
                        break;
                    }
                }
                System.out.println("The Greatest Factors of "+ num + " (beside itself) is: "+ greatestFactor);
            }
        }
    }    
}
