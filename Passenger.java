import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int age;
    private String address;
    private List<Ticket> tickets;

    public Passenger(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.tickets = new ArrayList<>();
    }

    public List<Train> searchTrains(String startLocation, String destinationLocation) {
        return RailwayDatabase.getInstance().searchTrains(startLocation, destinationLocation);
    }

    public List<String> viewSchedule(String trainId) {
        return RailwayDatabase.getInstance().getTrainSchedule(trainId);
    }

    public boolean reserveSeat(String trainId, String seatNumber) {
        return RailwayDatabase.getInstance().checkAndReserveSeat(trainId, seatNumber);
    }

    public Ticket purchaseTicket(Train train, String seatNumber, String startLocation,
                                 String destinationLocation) {
        TicketClerk clerk = new TicketClerk("Jane Smith", "Central Station");
        return clerk.reserveTicket(this, train, seatNumber, startLocation, destinationLocation);
    }

    public String getName() {
        return name;
    }
}