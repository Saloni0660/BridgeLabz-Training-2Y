interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + " | Price: " + price + " | Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountAmount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discountAmount);
        System.out.println("Discount applied on Veg Item: " + percentage + "%");
    }

    @Override
    public String getDiscountDetails() {
        return "Veg discount applied on item: " + getItemName();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 20;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountAmount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discountAmount);
        System.out.println("Discount applied on Non-Veg Item: " + percentage + "%");
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg discount applied on item: " + getItemName();
    }
}

public class OnlineFoodDemo {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Butter Masala", 150, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 200, 3);

        ((Discountable) item1).applyDiscount(10);
        ((Discountable) item2).applyDiscount(5);

        processOrder(item1);
        processOrder(item2);

        System.out.println(((Discountable) item1).getDiscountDetails());
        System.out.println(((Discountable) item2).getDiscountDetails());
    }
}
