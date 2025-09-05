import java.util.Scanner;

public class Replace {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Compare and replace word
            if (word.equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace and print result
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + modifiedSentence);

        }
    }
}
