import java.util.Scanner;

public class FriendsInfo {

    // Method to find the index of the youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find the index of the tallest friend
    public static int findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        // Find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println(names[youngestIndex] + " is the youngest friend with age " + ages[youngestIndex]);
        System.out.println(names[tallestIndex] + " is the tallest friend with height " + heights[tallestIndex] + " cm");

        }
    }
}
