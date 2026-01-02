public class SmartHomeApp {
    public static void main(String[] args) {

        Controllable[] devices = {
            new Light(),
            new Fan(),
            new AC()
        };

        for (Controllable device : devices) {
            device.turnOn();
        }
    }
}