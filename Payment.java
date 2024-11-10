public class Payment {
    private String name;
    private int age;
    private String address;
    private double amount;

    public Payment(String name, int age, String address, double amount) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.amount = amount;
    }

    public void payAmount() {
        System.out.println(name + " is paying the amount of " + amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}