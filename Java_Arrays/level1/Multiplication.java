import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a no. to print its multiplication table: ");
            int num = input.nextInt();

            int[] table = new int[10];
            for (int i=1; i<=10; i++){
                table[i-1] = num*i;
            }

            System.out.println("/nMultiplication Table of " + num + ":");
            for(int i=1; i<=10; i++){
                System.out.println(num + " * " + i + " = " + table[i-1]);
            }
        }
    }
}