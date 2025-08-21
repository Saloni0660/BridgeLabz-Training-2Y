public class ProfitLoss {
    public static void main(String[] args) {
        // Given values
        int costPrice = 129;
        int sellingPrice = 191;

        // Profit calculation
        int profit = sellingPrice - costPrice;

        // Profit percentage calculation
        double profitPercent = (profit * 100.0) / costPrice;

        // Output in a single print statement (multiline)
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
        );
    }
}

