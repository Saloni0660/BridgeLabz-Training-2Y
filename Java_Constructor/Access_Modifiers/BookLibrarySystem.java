class Book {
    public String ISBN;           
    protected String title;       
    private String author;        

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showAccess() {
        System.out.println("Accessing ISBN (public)   : " + ISBN);
        System.out.println("Accessing Title (protected): " + title);

    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("1234567890", "Java for Beginners", "John Doe");
        book.display();

        System.out.println();

        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println();

        EBook ebook = new EBook("0987654321", "Advanced Java", "Alice");
        ebook.showAccess();
    }
}

