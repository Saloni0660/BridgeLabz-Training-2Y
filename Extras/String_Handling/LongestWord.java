import java.util.Scanner; 

public class LongestWord {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.trim().split("\\s+");

            String longest = "";

            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longest.length()) {
                    longest = words[i];
                }
            }

            System.out.println("Longest word: " + longest);

        }
    }
}
