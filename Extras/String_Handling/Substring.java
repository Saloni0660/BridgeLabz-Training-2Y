import java.util.Scanner; // Single import

public class Substring {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
  
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + sub + "': " + count);

        }
    }
}
