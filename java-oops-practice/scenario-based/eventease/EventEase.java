package eventease;

public class EventEase{

    public static void main(String[] args) {

        User organizer = new User("Kartik", "kartik@email.com");

        Event birthday = new BirthdayEvent(101, "15-Aug-2026", organizer);
        Event conference = new ConferenceEvent(202, "01-Sep-2026", organizer);

        birthday.schedule();
        conference.schedule();

        birthday.reschedule("20-Aug-2026");
        conference.cancel();
    }
}
