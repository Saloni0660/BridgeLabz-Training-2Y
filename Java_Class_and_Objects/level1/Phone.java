public class Phone {
   
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy A14";
        phone1.price = 199.99;

        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 13";
        phone2.price = 999.99;

        phone1.displayDetails();
        phone2.displayDetails();
    }
}
