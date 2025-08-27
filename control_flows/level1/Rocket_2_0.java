import java.util.Scanner;

public class Rocket_2_0 {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("ENTER THE STARTING NO. FOR COUNTDOWN: ");
            int counter = input.nextInt();

            for (int i = counter; i>=1; i--){
                System.out.println(i);
            }

            System.out.println("LAUNCH...!!");
        }
    } 
    
}
