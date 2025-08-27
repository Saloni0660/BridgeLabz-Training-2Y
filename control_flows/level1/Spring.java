import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter month (1-12): ");
            int month = input.nextInt();

            System.out.print("Enter day(1-31): ");
            int day = input.nextInt();

            boolean isSpring = (month == 3 && day >= 20 && day <= 31) || //march 20 - 31
            (month == 4 && day >= 1 && day <= 30) || //april full month
            (month == 5 && day >= 1 && day <= 31) || //may full month
            (month == 6 && day >= 1 && day <= 20);//june 1-20
            
            if (isSpring){
                System.out.println("It's a Spring Season");
            }else{
                System.out.println("Not a Spring Season");
            }


        }
    }
    
}
