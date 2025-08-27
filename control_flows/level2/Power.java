import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter the base no. (positive integer): ");
            int num = input.nextInt();

            System.out.print("Enter the power (positive integer): ");
            int power = input.nextInt();

            if (num<0 || power<0){
              System.out.print("Please enter positive integer only: ");  
            }else{
                int result = 1;

                for (int i=1; i<=power; i++){
                    result *= num;
                }

                System.out.print(num + " raised to the power " + power + " is: " + result);

            }
        }
    }    
}
