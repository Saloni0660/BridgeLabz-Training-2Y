import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args){
        try( Scanner input = new Scanner(System.in)){

            System.out.print("Enter the first no.: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second no.: ");
            int num2 = input.nextInt();

            System.out.print("Enter the third no.: ");
            int num3 = input.nextInt();

            int largest = num1;
            if (num2 > largest){
                largest = num2;
            }
            if (num3 > largest){
                largest = num3;
            }

            // Output Results
            System.out.println("Is the first no. the largest?" + ( num1 == largest));
            System.out.println("Is the second no. the largest?" + ( num2 == largest));
            System.out.println("Is the third no. the largest?" + ( num3 == largest));


        }
    }
}