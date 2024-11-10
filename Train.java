import java.util.HashMap;
import java.util.Map;

public class Train {
    private String model;
    private String trainId;
    private Map<String, Boolean> seats;

    public Train(String model, String trainId) {
        this.model = model;
        this.trainId = trainId;
        this.seats = new HashMap<>();
        // Initialize seats (example: 50 seats)
        for (int i = 1; i <= 50; i++) {
            seats.put("S" + i, false);
        }
    }

    public String getTrainId() {
        return trainId;
    }

    public String getModel() {
        return model;
    }

    public boolean isSeatAvailable(String seatNumber) {
        return !seats.getOrDefault(seatNumber, true);
    }

    public void bookSeat(String seatNumber) {
        seats.put(seatNumber, true);
    }

    public void releaseSeat(String seatNumber) {
        seats.put(seatNumber, false);
    }
}