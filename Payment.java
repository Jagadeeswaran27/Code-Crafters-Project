public class Payment extends Passenger {
    double Amount;

    Payment(String Name, int Age, String Address, double Amount) {
        super(Name, Age, Address);
        this.Amount = Amount;
    }

    void playAmount() {
        System.out.println("Amount: " + Amount);
    }
}
