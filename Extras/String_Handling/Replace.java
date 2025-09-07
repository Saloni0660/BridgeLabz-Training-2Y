import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            System.out.print("Enter the word to replace: ");
            String oldWord = sc.nextLine();

            System.out.print("Enter the new word: ");
            String newWord = sc.nextLine();

            // Using replaceAll to replace exact words (word boundaries)
            String modifiedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

            System.out.println("Modified sentence: " + modifiedSentence);
        }
    }
}
