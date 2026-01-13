package trafficmanager;


public class App {

    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();

        roundabout.arrive("KA01");
        roundabout.arrive("MH22");
        roundabout.arrive("DL09");
        roundabout.arrive("TN07");
        roundabout.arrive("RJ14");
        roundabout.arrive("UP32"); 
        System.out.println();
        roundabout.displayRoundabout();

        System.out.println();
        roundabout.exitVehicle();
        roundabout.exitVehicle();

        System.out.println();
        roundabout.displayRoundabout();
    }
}
