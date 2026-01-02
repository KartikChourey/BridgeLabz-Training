

interface Controllable {
    void turnOn();
    void turnOff();
}


abstract class Appliance implements Controllable {
    private boolean powerStatus;

    protected void setPower(boolean status) {
        powerStatus = status;
    }

    protected boolean isOn() {
        return powerStatus;
    }
}