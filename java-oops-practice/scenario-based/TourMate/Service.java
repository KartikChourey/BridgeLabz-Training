package TourMate;

//Abstract service class (Hotel, Transport, Activity)
public abstract class Service {

 protected double cost;

 protected double getCost() {
     return cost; // hidden cost breakdown
 }
}
