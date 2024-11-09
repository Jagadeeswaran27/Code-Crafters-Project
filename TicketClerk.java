public class TicketClerk {
    String ClerkName;
    String Location;

    TicketClerk(String ClerkName, String Location) {
        this.ClerkName = ClerkName;
        this.Location = Location;
    }

    void ReserveSeat() {
        System.out.println("Reserving seat...");
    }

    void ReserveTicket() {
        System.out.println("Reserving ticket...");
    }

    void CancelTicket() {
        System.out.println("Cancelling ticket...");
    }

    void CancelPayment() {
        System.out.println("Cancelling payment...");
    }

}
