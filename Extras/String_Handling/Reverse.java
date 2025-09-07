import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();

        }
    }
}
