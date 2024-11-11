import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RailwayDatabase db = RailwayDatabase.getInstance();

        Passenger passenger = new Passenger("John Doe", 30, "123 Main St");
        TicketClerk clerk = new TicketClerk("Jane Smith", "Central Station");

        System.out.println("Railway Ticket Booking System Demo");
        System.out.println("----------------------------------");

        List<Train> availableTrains = passenger.searchTrains("New York", "Boston");
        System.out.println("Available trains: " + availableTrains.size());

        for (Train train : availableTrains) {
            System.out.println("Train ID: " + train.getTrainId() + ", Train Name: " + train.getModel());
        }

        if (!availableTrains.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the train ID: ");
            String selectedTrainId = scanner.next();

            Train selectedTrain = null;
            for (Train train : availableTrains) {
                if (train.getTrainId().equals(selectedTrainId)) {
                    selectedTrain = train;
                    break;
                }
            }

            if (selectedTrain != null) {
                System.out.println("Selected train: " + selectedTrain.getTrainId());

                List<String> schedule = passenger.viewSchedule(selectedTrain.getTrainId());
                System.out.println("\nTrain Schedule:");
                schedule.forEach(System.out::println);

                double ticketPrice = clerk.calculateFare("New York", "Boston");
                System.out.println("Ticket Price: $" + ticketPrice);

                Ticket ticket = clerk.reserveTicket(passenger, selectedTrain, "S1", "New York", "Boston");
                if (ticket != null) {
                    System.out.println("Ticket reserved successfully. Ticket No: " + ticket.getTicketNo());
                    System.out.println("Ticket Price: $" + ticket.getPaymentAmount());
                } else {
                    System.out.println("Failed to reserve ticket.");
                }
            } else {
                System.out.println("Invalid train ID.");
            }
        }
    }
}
