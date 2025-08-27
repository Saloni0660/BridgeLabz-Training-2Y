import java.util.Scanner;

public class Greatest{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a positive no.: ");
            int num = input.nextInt();

            if(num<=1){
                System.out.println("Please enter an integer greater than 1.");
            }else{
                int greatestFactor=1;
                int counter = num-1;

                while(counter>=1){
                    if(num%counter==0){
                        greatestFactor=counter;
                        break;
                    }
                    counter--;
                }
                System.out.println("The Greatest Factors of "+ num + " (beside itself) is: "+ greatestFactor);
            }
        }
    }    
}
