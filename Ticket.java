public class Ticket extends Passenger {
    int TicketNumber;
    String StartingLocation;
    String DestinationLocation;
    String PassengerNo;

    Ticket(String Name, int Age, String Address,int TicketNumber, String StartingLocation, String DestinationLocation, String PassengerNo) {
        super(Name, Age, Address);
        this.TicketNumber = TicketNumber;
        this.StartingLocation = StartingLocation;
        this.DestinationLocation = DestinationLocation;
        this.PassengerNo = PassengerNo;
    }

    void PaymentAmount() {
        System.out.println("Calculating payment amount...");
    }
    void CancelTicket() {
        System.out.println("Cancelling ticket...");
    }

}
