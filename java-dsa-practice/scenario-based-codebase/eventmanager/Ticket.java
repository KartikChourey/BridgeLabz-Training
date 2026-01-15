package eventmanager;

class Ticket {
    int ticketId;
    double price;

    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Price: ₹" + price;
    }
}