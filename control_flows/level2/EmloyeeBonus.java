import java.util.Scanner;

public class EmloyeeBonus {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter your salary: ");
            double salary = input.nextDouble();

            System.out.print("Enter your years of service: ");
            int years = input.nextInt();

            if(years>5){
                double bonus = salary*0.05;
                System.out.println("Bonus amount is: " + bonus);
            }else{
                System.out.println("No bonus, since years of services is less than 5 years.");
            }
        }
    }
    
}
