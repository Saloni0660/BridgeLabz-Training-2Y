import java.util.Random;

public class Football {

    // b. Generate random heights between 150 and 250 cm for 11 players
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250 inclusive
        }
        return heights;
    }

    // c. Calculate sum of all heights
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // d. Calculate mean height
    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    // e. Find shortest height
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // f. Find tallest height
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + sumHeights(heights));
        System.out.printf("Mean height: %.2f\n", meanHeight(heights));
        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
    }
}
