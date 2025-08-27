import java.util.Scanner;

public class DigitCount{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a no.: ");
            int num = input.nextInt();

            num= Math.abs(num);
            int count=0;

            if(num == 0){
                count=1;
            }else{
                while(num != 0){
                    num = num/10;
                count++;
                }
                
            }

            System.out.println("No. of digits: " + count);
        }    
    }
}