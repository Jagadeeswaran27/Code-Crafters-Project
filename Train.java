public class Train extends Passenger {
    String Model;
    String TrainId;
    Train(String Name, int Age, String Address, String Model, String TrainId) {
        super(Name, Age, Address);
        this.Model = Model;
        this.TrainId = TrainId;
    }
}



