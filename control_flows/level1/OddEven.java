import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        try( Scanner input = new Scanner(System.in)){
          
            System.out.print("Enter a natural no. : ");
            int num = input.nextInt();

            if (num <= 0){
                System.out.println("The no. " + num + " is not a natural no. ");
            }else{
                for (int i=1; i<= num; i++){
                    if(i%2==0){
                        System.out.println(i + " is an even no.");
                    }else{
                        System.out.println(i + " is an odd no.");
                    }

                }

            }
        }
    }
}