import java.util.ArrayList;
import java.util.Scanner;

public class word_Length {

    // Method to get length of string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split string into words using charAt() (no split())
    public static String[] customSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int length = getLength(text);

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (getLength(word.toString()) > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }

        // Add last word if any
        if (getLength(word.toString()) > 0) {
            words.add(word.toString());
        }

        return words.toArray(new String[0]);
    }

    // Method to return 2D array of word and its length (as String)
    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(getLength(words[i])); // length as String
        }

        return result;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            

        // Step 1: Get full text input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Step 2: Custom split
        String[] words = customSplit(input);

        // Step 3: Get 2D array of word and length
        String[][] wordTable = getWordLengthTable(words);

        // Step 4: Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]); // Convert back to int
            System.out.println(word + "\t\t" + length);
        }

        }
    }
}
