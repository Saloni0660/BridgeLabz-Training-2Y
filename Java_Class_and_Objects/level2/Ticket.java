public class Ticket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!\n");
    }

    void displayTicket() {
        System.out.println("--- Ticket Details ---");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : $" + price);
    }

    public static void main(String[] args) {
        
        Ticket ticket1 = new Ticket();

        ticket1.bookTicket("Avengers: Endgame", 12, 10.50);

        ticket1.displayTicket();

        Ticket ticket2 = new Ticket();
        ticket2.bookTicket("Oppenheimer", 25, 12.00);
        ticket2.displayTicket();
    }
}
