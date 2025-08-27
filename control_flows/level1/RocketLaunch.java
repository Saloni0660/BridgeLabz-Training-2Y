import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("ENTER THE STARTING NO. FOR COUNTDOWN: ");
            int counter = input.nextInt();

            while (counter >= 1){
                System.out.println(counter);
                counter--;
            }

            System.out.println("LAUNCH...!!");
        
        }
    }
    
}
