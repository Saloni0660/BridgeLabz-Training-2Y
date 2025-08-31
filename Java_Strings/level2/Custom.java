import java.util.Scanner;

public class Custom{

    // Method to find string length without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the string into words without using split()
    public static String[] customSplit(String text) {
        int length = getLength(text);

        // Step 1: Count the number of words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];  // one less than word count
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using spaceIndexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = extractSubstring(text, start, end);
            start = end + 1;
        }

        // Last word from last space to end
        words[wordCount - 1] = extractSubstring(text, start, length);
        return words;
    }

    // Method to extract substring from start to end (exclusive)
    public static String extractSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two string arrays
    public static boolean compareWordArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        // Step 1: Take full line of input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Step 2: Split using custom method
        String[] customWords = customSplit(input);

        // Step 3: Split using built-in split()
        String[] builtInWords = input.split(" ");

        // Step 4: Compare both results
        boolean isSame = compareWordArrays(customWords, builtInWords);

        // Step 5: Display results
        System.out.println("\nCustom split result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nDo both methods produce the same result? " + isSame);

        }
    }
}
