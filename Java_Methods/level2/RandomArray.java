import java.util.Random;

public class RandomArray {

    // a. Generate array of 4-digit random numbers of given size
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // 4-digit numbers range from 1000 to 9999
            numbers[i] = rand.nextInt(9000) + 1000;
        }
        
        return numbers;
    }

    // b. Find average, min, and max of array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        double[] results = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\nMin: %.0f\nMax: %.0f\n", results[0], results[1], results[2]);
    }
}
