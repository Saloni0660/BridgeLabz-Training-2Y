public class String_Trimmer {

    // Method to find start and end index (non-space chars)
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find first non-space character from the beginning
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean customCompare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String original = "   Hello World!   ";

        // Step 1: Get the start and end index after trimming spaces
        int[] indices = getTrimIndices(original);
        int start = indices[0];
        int end = indices[1];

        // Step 2: Use custom substring method to extract trimmed string
        String trimmedCustom = customSubstring(original, start, end);

        // Step 3: Use built-in trim() method
        String trimmedBuiltIn = original.trim();

        // Step 4: Compare the two using custom method
        boolean isEqual = customCompare(trimmedCustom, trimmedBuiltIn);

        // Step 5: Display results
        System.out.println("Original string: \"" + original + "\"");
        System.out.println("Custom trimmed : \"" + trimmedCustom + "\"");
        System.out.println("Built-in trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Strings match: " + isEqual);
    }
}
