package ambulanceroute;

public class AmbulanceRoute{

    public static void main(String[] args) {

        Ambulance route = new Ambulance();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        // Redirect incoming patient
        route.redirectPatient();

        // Unit goes under maintenance
        route.removeUnit("Radiology");
        route.displayUnits();

        // Redirect again
        route.redirectPatient();
    }
}
