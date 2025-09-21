public class LibraryDemo {
    public static void main(String[] args) {
    
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M202", "Tech Monthly", "John Editor");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        item1.getItemDetails();
        item2.getItemDetails();
        item3.getItemDetails();

        System.out.println(item1.getTitle() + " loan duration: " + item1.getLoanDuration() + " days");
        System.out.println(item2.getTitle() + " loan duration: " + item2.getLoanDuration() + " days");
        System.out.println(item3.getTitle() + " loan duration: " + item3.getLoanDuration() + " days");

        ((Reservable) item1).reserveItem("Alice");
        ((Reservable) item2).reserveItem("Bob");
        ((Reservable) item3).reserveItem("Charlie");

        ((Reservable) item1).reserveItem("David");

        System.out.println("Is Book available? " + ((Reservable) item1).checkAvailability());
        System.out.println("Is Magazine available? " + ((Reservable) item2).checkAvailability());
        System.out.println("Is DVD available? " + ((Reservable) item3).checkAvailability());
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower; 

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = "";
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author + 
                           " | Reserved: " + (isReserved ? "Yes" : "No"));
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
        this.isReserved = (borrower != null && !borrower.isEmpty());
    }

    protected String getBorrower() {
        return borrower;
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("Book is already reserved.");
        } else {
            setBorrower(borrowerName);
            System.out.println("Book reserved successfully by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower().isEmpty();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("Magazine is already reserved.");
        } else {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved successfully by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower().isEmpty();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("DVD is already reserved.");
        } else {
            setBorrower(borrowerName);
            System.out.println("DVD reserved successfully by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower().isEmpty();
    }
}
