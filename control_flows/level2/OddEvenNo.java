import java.util.Scanner;

public class OddEvenNo {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter n no.: ");
            int num = input.nextInt();

            if(num<=0){
                System.out.println("The number " + num + " is not a natural no.");

            }else{
                System.out.println("Odd and Even numbers between 1 and " + num);

                for(int i=1; i<=num; i++){
                    if(i%2==0){
                        System.out.println(i + " is Even.");
                    }else{
                        System.out.println(i + " is Odd.");
                    }
                }
            }
        }
    }
}
