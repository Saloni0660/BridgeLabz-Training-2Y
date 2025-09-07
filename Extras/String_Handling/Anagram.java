import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first string: ");
            String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            System.out.print("Enter second string: ");
            String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            if (isAnagram(str1, str2)) {
                System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
            } else {
                System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
            }
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
