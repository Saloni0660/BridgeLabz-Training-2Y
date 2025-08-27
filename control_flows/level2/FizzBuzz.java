import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a no.: ");
            int num = input.nextInt();

            if (num>0){
                System.out.println("FizzBuzz from 1 to " + num + " are :");

                for (int i=1; i<=num; i++){
                    if (i%3==0 && i%5==0){
                        System.out.println("FizzBuzz");
                    }else if (i%3==0){
                        System.out.println("Fizz");
                    }else if (i%5==0){
                        System.out.println("Buzz");
                    }else{
                        System.out.println(i);
                    }

                }
            }else{
                System.out.println("The number "+ num + " is not a positive integer.");
            }
        }
    }    
}
