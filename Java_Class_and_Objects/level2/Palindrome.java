public class Palindrome {
   
    String text;

    void checkPalindrome() {
        String original = text.toLowerCase();   
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {

        Palindrome p1 = new Palindrome();
        p1.text = "Madam";
        p1.checkPalindrome();

        Palindrome p2 = new Palindrome();
        p2.text = "World";
        p2.checkPalindrome();
    }
}
