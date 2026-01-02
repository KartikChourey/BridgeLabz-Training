class AC extends Appliance {

    public void turnOn() {
        setPower(true);
        System.out.println("AC cooling started");
    }

    public void turnOff() {
        setPower(false);
        System.out.println("AC turned off");
    }
}