package ticketbooking;



public class Main {
    public static void main(String[] args) {

        Event events = new Event();

        events.addEvent(1800, "Concert");
        events.addEvent(1400, "Workshop");
        events.addEvent(2000, "Stand-up Show");

        System.out.println("Upcoming Events:");
        events.displaySchedule();

        System.out.println("Event at 1400 cancelled");
        events.cancelEvent(1400);

        System.out.println("Updated Schedule:");
        events.displaySchedule();
    }
}

