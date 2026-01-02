class Light extends Appliance {

    public void turnOn() {
        setPower(true);
        System.out.println("Light is ON");
    }

    public void turnOff() {
        setPower(false);
        System.out.println("Light is OFF");
    }
}