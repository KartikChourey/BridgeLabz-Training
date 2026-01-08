package TourMate;

public class TourMate{

    public static void main(String[] args) {

        Hotel hotel = new Hotel(5);
        Transport transport = new Transport("Flight");
        Activity activity = new Activity(3);

        Trip trip = new InternationalTrip("Paris", 7, hotel, transport, activity);
        trip.book();
    }
}
