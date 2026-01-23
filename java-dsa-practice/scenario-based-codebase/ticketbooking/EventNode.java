package ticketbooking;


class EventNode {
    int time;          
    String eventName;
    int height;
    EventNode left, right;

    EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        this.height = 1;
    }
}
