import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a no.: ");
            int num = input.nextInt();

            int sum=0;
            int originalNum=num;

            while(originalNum != 0){
                int digit = originalNum%10;
                sum += digit*digit*digit;
                originalNum=originalNum/10;
            }

            if(num == sum){
                System.out.println(num + " is a Armstrong no.");
            }else{
                System.out.println(num + " is not an Armstrong no.");
            }
        }
    }    
}
