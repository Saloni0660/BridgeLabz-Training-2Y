public class Books {
    String title;
    String author;
    double price;
    boolean available;

    public Books(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : $" + price);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
        book1.displayDetails();

        System.out.println();

        book1.borrowBook();

        book1.borrowBook();

        System.out.println();

        book1.displayDetails();
    }
}
