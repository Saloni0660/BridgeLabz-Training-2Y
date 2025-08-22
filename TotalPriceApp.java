import java.util.Scanner;

public class TotalPriceApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter unit price (INR): ");
            double unitPrice = input.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double totalPrice = unitPrice * quantity;

            System.out.println("\n--- Result ---");
            System.out.println("The total purchase price is INR " + totalPrice);
        }
    }
}