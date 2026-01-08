package TourMate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
        this.budget += 10000; // visa & tax charges
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination);
        System.out.println("Total Budget (incl. taxes): ₹" + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges");
    }
}
