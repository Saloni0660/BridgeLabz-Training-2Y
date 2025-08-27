import java.util.Scanner;

public class Zero{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double total = 0.0;

            while (true){

                System.out.print("Enter a no. (0 or negative to stop): ");
                double number = input.nextDouble();

                if (number <= 0){
                    break;
                }

                total += number;
            }

            System.out.println("The total sum is: " + total);



        }
    
    }
}
    