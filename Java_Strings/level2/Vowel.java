import java.util.Scanner;

public class Vowel{

    // Method to convert uppercase character to lowercase using ASCII
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // ASCII difference between upper and lower is 32
        }
        return ch;
    }

    // Method to check if character is Vowel, Consonant or Not a Letter
    public static String checkCharacterType(char ch) {
        ch = toLowerCase(ch); // convert to lowercase if needed

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        int i = 0;
        try {
            while (true) {
                char ch = text.charAt(i);
                String type = checkCharacterType(ch);
                if (type.equals("Vowel")) {
                    vowelCount++;
                } else if (type.equals("Consonant")) {
                    consonantCount++;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(input);

        // Display result
        System.out.println("\nTotal Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);

        }
    }
}
