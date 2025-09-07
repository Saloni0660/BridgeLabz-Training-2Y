import java.util.Scanner;

public class Frequent {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int[] freq = new int[256]; 
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)]++;
            }

            int maxFreq = 0;
            char mostFrequentChar = '\0';

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    mostFrequentChar = (char) i;
                }
            }

            System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        }
    }
}
