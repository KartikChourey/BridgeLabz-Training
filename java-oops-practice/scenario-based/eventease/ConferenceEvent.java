package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String date, User organizer) {
        super(eventId, "Conference", "Convention Center", date,
              300, organizer, 80000, 50000, 5000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled on " + date +
                " | Total Cost: ₹" + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Conference rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
