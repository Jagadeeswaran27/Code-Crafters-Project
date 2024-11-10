public class TicketClerk {
    private String name;
    private String location;
    
    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public boolean reserveSeat(String trainId, String seatNumber) {
        return RailwayDatabase.getInstance().checkAndReserveSeat(trainId, seatNumber);
    }
    
    public Ticket reserveTicket(Passenger passenger, Train train, String seatNumber,
                               String startLocation, String destinationLocation) {
        if (reserveSeat(train.getTrainId(), seatNumber)) {
            Ticket ticket = new Ticket();
            ticket.setTicketNo(generateTicketNumber());
            ticket.setStartingLocation(startLocation);
            ticket.setDestinationLocation(destinationLocation);
            ticket.setPassengerNo(passenger.getName());
            ticket.setPaymentAmount(calculateFare(startLocation, destinationLocation));
            return ticket;
        }
        return null;
    }
    
    public boolean cancelTicket(String ticketNo) {
        return RailwayDatabase.getInstance().cancelTicket(ticketNo);
    }
    
    private String generateTicketNumber() {
        return "T" + System.currentTimeMillis();
    }
    
    private double calculateFare(String startLocation, String destinationLocation) {
        // Simplified fare calculation
        return 50.0;
    }
}