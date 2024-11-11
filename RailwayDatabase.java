import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RailwayDatabase {
    private static RailwayDatabase instance;
    private Map<String, Train> trains;
    private Map<String, Ticket> tickets;

    private RailwayDatabase() {
        trains = new HashMap<>();
        tickets = new HashMap<>();
        trains.put("T123", new Train("Express", "T123"));
        trains.put("T456", new Train("Local", "T456"));
    }

    public static RailwayDatabase getInstance() {
        if (instance == null) {
            instance = new RailwayDatabase();
        }
        return instance;
    }

    public List<Train> searchTrains(String startLocation, String destinationLocation) {
        return new ArrayList<>(trains.values());
    }

    public List<String> getTrainSchedule(String trainId) {
        List<String> schedule = new ArrayList<>();
        schedule.add("08:00 AM - New York");
        schedule.add("10:00 AM - Boston");
        return schedule;
    }

    public boolean checkAndReserveSeat(String trainId, String seatNumber) {
        Train train = trains.get(trainId);
        if (train != null && train.isSeatAvailable(seatNumber)) {
            train.bookSeat(seatNumber);
            return true;
        }
        return false;
    }

    public boolean cancelTicket(String ticketNo) {
        Ticket ticket = tickets.remove(ticketNo);
        if (ticket != null) {
            Train train = trains.get(ticket.getPassengerNo());
            if (train != null) {
                train.releaseSeat(ticket.getPassengerNo());
            }
            return true;
        }
        return false;
    }
}