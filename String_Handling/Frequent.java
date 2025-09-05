import java.util.Scanner;

public class Frequent {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = new int[256]; 
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequentChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        }
    }
}
