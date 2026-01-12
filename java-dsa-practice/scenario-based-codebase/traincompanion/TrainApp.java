package traincompanion;



public class TrainApp {

    public static void main(String[] args) {

        Companion train = new Companion();

        train.addCompartment("S1");
        train.addCompartment("S2");
        train.addCompartment("Pantry");
        train.addCompartment("WiFi");
        train.addCompartment("S3");

        System.out.println();

        train.walkForward();
        train.walkBackward();

        System.out.println();
        train.showAdjacent("Pantry");

        System.out.println();
        train.removeCompartment("WiFi");

        System.out.println();
        train.walkForward();
    }
}
