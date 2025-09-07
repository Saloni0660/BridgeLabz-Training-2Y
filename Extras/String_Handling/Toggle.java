import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String toggled = "";

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isUpperCase(ch)) {
                    toggled += Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    toggled += Character.toUpperCase(ch);
                } else {
                    toggled += ch;
                }
            }

            System.out.println("Toggled case string: " + toggled);

        }
    }
}
