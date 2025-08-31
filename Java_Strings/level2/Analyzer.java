import java.util.ArrayList;
import java.util.Scanner;

public class Analyzer {

    // Method to get string length without using length()
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

    // Method to split text into words using charAt()
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

    // Method to generate 2D array of word and its length
    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }

        return result;
    }

    // Method to find index of shortest and longest word
    // Returns int array: [shortestIndex, longestIndex]
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            int shortest = Integer.parseInt(wordTable[shortestIndex][1]);
            int longest = Integer.parseInt(wordTable[longestIndex][1]);

            if (length < shortest) {
                shortestIndex = i;
            }

            if (length > longest) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            

        // Step 1: Take full input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Step 2: Split into words
        String[] words = customSplit(input);

        // Step 3: Generate 2D table of word and length
        String[][] wordTable = getWordLengthTable(words);

        // Step 4: Find shortest and longest words
        int[] result = findShortestAndLongest(wordTable);
        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Step 5: Display words with their lengths
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]);
            System.out.println(word + "\t\t" + length);
        }

        // Step 6: Display shortest and longest
        System.out.println("\nShortest word: " + wordTable[shortestIndex][0] +
                " (Length: " + wordTable[shortestIndex][1] + ")");
        System.out.println("Longest word: " + wordTable[longestIndex][0] +
                " (Length: " + wordTable[longestIndex][1] + ")");

        }
    }
}
