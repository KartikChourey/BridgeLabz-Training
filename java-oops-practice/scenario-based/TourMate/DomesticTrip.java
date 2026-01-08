package TourMate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked to " + destination);
        System.out.println("Total Budget: ₹" + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled");
    }
}
