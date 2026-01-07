package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String date, User organizer) {
        super(eventId, "Birthday Party", "Banquet Hall", date,
              50, organizer, 20000, 10000, 2000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled for " + date +
                " | Total Cost: ₹" + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Birthday event rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
