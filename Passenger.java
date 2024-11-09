public class Passenger {
    String Name;
    int Age;
    String Address;

    Passenger(String Name, int Age, String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }

    void SearchTrain() {
        System.out.println("Searching for trains...");
    }

    void ViewSchedule() {
        System.out.println("Viewing schedule...");
    }

    void ResearveSeat() {
        System.out.println("Reserving seat...");
    }

    void PurchaseTicket() {
        System.out.println("Purchasing ticket...");
    }

    void CancelTicket() {
        System.out.println("Cancelling ticket...");
    }

    void MakePayment() {
        System.out.println("Making payment...");
    }

}
