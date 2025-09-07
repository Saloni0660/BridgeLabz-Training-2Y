import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        }
    }
}
