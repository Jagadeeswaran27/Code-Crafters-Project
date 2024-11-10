import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize database
        RailwayDatabase db = RailwayDatabase.getInstance();
        
        // Create passenger and ticket clerk
        Passenger passenger = new Passenger("John Doe", 30, "123 Main St");
        TicketClerk clerk = new TicketClerk("Jane Smith", "Central Station");
        
        // Demo booking flow
        System.out.println("Railway Ticket Booking System Demo");
        System.out.println("----------------------------------");
        
        // Search for trains
        List<Train> availableTrains = passenger.searchTrains("New York", "Boston");
        System.out.println("Available trains: " + availableTrains.size());
        
        // Show available trains
        for (Train train : availableTrains) {
            System.out.println("Train ID: " + train.getTrainId() + ", Train Name: " + train.getModel());
        }
        
        if (!availableTrains.isEmpty()) {
            Train selectedTrain = availableTrains.get(0);
            System.out.println("Selected train: " + selectedTrain.getTrainId());
            
            // View schedule
            List<String> schedule = passenger.viewSchedule(selectedTrain.getTrainId());
            System.out.println("\nTrain Schedule:");
            schedule.forEach(System.out::println);
            
            // Purchase ticket 
            Ticket ticket = clerk.reserveTicket(passenger, selectedTrain, "S1", "New York", "Boston");
            if (ticket != null) {
                System.out.println("Ticket reserved successfully. Ticket No: " + ticket.getTicketNo());
            } else {
                System.out.println("Failed to reserve ticket.");
            }
        }
    }
}