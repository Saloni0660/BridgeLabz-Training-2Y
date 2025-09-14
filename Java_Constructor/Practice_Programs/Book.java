public class Book {

    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + price);
    }

    public static void main(String[] args) {

        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        Book paramBook = new Book("1984", "George Orwell", 12.99);
        System.out.println("Parameterized Book:");
        paramBook.displayDetails();
    }
}
