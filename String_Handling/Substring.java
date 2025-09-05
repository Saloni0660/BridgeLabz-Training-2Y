import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();

        int count = 0;

        for (int i = 0; i <= mainString.length() - subString.length(); i++) {

            if (mainString.substring(i, i + subString.length()).equals(subString)) {
                count++;
            }
        }

        System.out.println("The substring '" + subString + "' occurs " + count + " times.");

        }
    }
}
