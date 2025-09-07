import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter String 1: ");
            String str1 = sc.nextLine();

            System.out.print("Enter String 2: ");
            String str2 = sc.nextLine();

            int result = compareStrings(str1, str2);

            if (result < 0) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (result > 0) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            }
        }
    }

    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1, len2);

        for (int i = 0; i < lim; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;  
            }
        }

        return len1 - len2;
    }
}
