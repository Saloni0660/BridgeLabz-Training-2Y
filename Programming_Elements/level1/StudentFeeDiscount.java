import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        double fee, discountPercent;

        // Create Scanner object with try-with-resources (auto closes)
        try (Scanner input = new Scanner(System.in)) {
            // a. Take user input
            System.out.print("Enter Course Fee (INR): ");
            fee = input.nextDouble();

            System.out.print("Enter Discount Percentage: ");
            discountPercent = input.nextDouble();

            // b. Compute discount
            double discount = (fee * discountPercent) / 100;

            // c. Compute final fee
            double finalFee = fee - discount;

            // d. Output
            System.out.println("The discount amount is INR " + discount +
                               " and final discounted fee is INR " + finalFee);
        }
    }
}