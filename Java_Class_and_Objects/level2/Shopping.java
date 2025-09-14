public class Shopping {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
        System.out.println("Item added to cart.\n");
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.\n");
    }

    void displayTotalCost() {
        if (itemName.equals("")) {
            System.out.println("Cart is empty.\n");
        } else {
            double total = price * quantity;
            System.out.println("Item Name : " + itemName);
            System.out.println("Price     : $" + price);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Total Cost: $" + total + "\n");
        }
    }

    public static void main(String[] args) {

        Shopping cart = new Shopping();

        cart.addItem("Pen", 1.50, 3);

        cart.displayTotalCost();

        cart.removeItem();

        cart.displayTotalCost();
    }
}
