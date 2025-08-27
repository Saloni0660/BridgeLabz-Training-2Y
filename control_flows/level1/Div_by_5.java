import java.util.Scanner;

public class Div_by_5 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter a no.:");
            int num = input.nextInt();

            if (num % 5 == 0){
                System.out.println(num + " is divisible by 5.");
            }else{
                System.out.println(num + " is not divisible by 5.");
            }

            
        }catch (Exception e){
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}