import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product laptop = new Electronics(101, "Laptop", 1200.00);
        Product tshirt = new Clothing(102, "T-Shirt", 40.00);
        Product apples = new Groceries(103, "Apples", 10.00);

        products.add(laptop);
        products.add(tshirt);
        products.add(apples);

        for (Product product : products) {
            System.out.println("\n--- Product Details ---");
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                System.out.println("Tax Details: " + taxable.getTaxDetails());
                System.out.printf("Tax: $%.2f%n", tax);
            } else {
                System.out.println("Tax Details: Non-Taxable Item");
            }

            System.out.printf("Discount: $%.2f%n", discount);
            double finalPrice = product.getPrice() + tax - discount;
            System.out.printf("Final Price: $%.2f%n", finalPrice);
        }
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Public constructor with correct signature
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Concrete method to display details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f%n", price);
    }
}

class Electronics extends Product implements Taxable {
    private final double discountRate = 0.10;
    private final double taxRate = 0.18;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%)";
    }
}

class Clothing extends Product implements Taxable {
    private final double discountRate = 0.15;
    private final double taxRate = 0.12;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (12%)";
    }
}

class Groceries extends Product {
    private final double discountRate = 0.05;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}
