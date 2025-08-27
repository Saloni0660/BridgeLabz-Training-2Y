import java.util.Scanner;

public class LeapYears{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter a year(>= 1582): ");
            int year = input.nextInt();

            if (year<1582){
                System.out.println("Please enter a year greater than or equal to 1582: ");
            }else{
                if ((year%4==0 && year%100!=0) || (year%400==0)){
                    System.out.println(year + " is a leap year.");
                }else{
                    System.out.println(year + " is not a leap year.");
                }
        
            }
        }
    }    
}
