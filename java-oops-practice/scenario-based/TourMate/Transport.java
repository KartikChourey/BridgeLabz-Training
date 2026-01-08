package TourMate;

public class Transport extends Service {

    public Transport(String mode) {
        if (mode.equalsIgnoreCase("Flight"))
            cost = 8000;
        else
            cost = 3000;
    }
}
