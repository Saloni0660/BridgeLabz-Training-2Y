public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Step a: Original fee
        int fee = 125000;

        // Step b: Discount percentage
        int discountPercent = 10;

        // Step c: Compute discount
        int discount = (fee * discountPercent) / 100;

        // Step d: Compute final fee after discount
        int finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}

