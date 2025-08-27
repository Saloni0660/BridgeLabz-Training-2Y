import java.util.Scanner;

public class Below100_While{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a positive integer less than 100: ");
            int num = input.nextInt();

            if(num<=0 || num>=100){
                System.out.println("Please enter a positive integer less than 100.");
            }else{
                int counter=100;
                System.out.println("Multiples of "+ num + " below 100 are: ");

                while(counter>0){
                    if (counter%num==0){
                        System.out.println(counter);
                    }

                    counter--;
                }
            }
        }
    }    
}
