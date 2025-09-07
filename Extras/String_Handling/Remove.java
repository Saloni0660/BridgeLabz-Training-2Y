import java.util.Scanner;

public class Remove {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.print("Enter the character to remove: ");
            char chToRemove = sc.nextLine().charAt(0);

            StringBuilder modifiedStr = new StringBuilder();

            // Loop through each character and append only if not equal to chToRemove
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != chToRemove) {
                    modifiedStr.append(ch);
                }
            }

            System.out.println("Modified String: \"" + modifiedStr.toString() + "\"");
        }
    }
}
