import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a no.: ");
            int num = input.nextInt();

            System.out.println("Multiplication Table of " + num + " from 6 to 9");
            for(int i=6; i<=9; i++){
                System.out.println(num + " * " + i + " = " + (num*i));
            }
        }
    }    
}
