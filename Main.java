public class Main {
    public static void main(String[] args) {
        // Create instances of the classes
        TicketClerk ticketClerk = new TicketClerk("John Doe", "Central Station");
        RailwayDatabase railwayDatabase = new RailwayDatabase("Jane Doe", "West Station", 1);
        Passenger passenger = new Passenger("Alice", 30, "123 Main St");
        Train train = new Train("Bob", 40, "456 Elm St", "Express", "T123");
        Ticket ticket = new Ticket("Charlie", 25, "789 Oak St", 1001, "Central Station", "West Station", "P001");
        Payment payment = new Payment("Dave", 35, "101 Pine St", 50.0);

        // Call methods on the instances
        ticketClerk.ReserveSeat();
        ticketClerk.ReserveTicket();
        ticketClerk.CancelTicket();
        ticketClerk.CancelPayment();

        passenger.SearchTrain();
        passenger.ViewSchedule();
        passenger.ResearveSeat();
        passenger.PurchaseTicket();
        passenger.CancelTicket();
        passenger.MakePayment();

        train.SearchTrain();
        train.ViewSchedule();
        train.ResearveSeat();
        train.PurchaseTicket();
        train.CancelTicket();
        train.MakePayment();

        ticket.PaymentAmount();
        ticket.CancelTicket();

        payment.playAmount();
    }
}
