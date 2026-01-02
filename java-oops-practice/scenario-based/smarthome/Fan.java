class Fan extends Appliance {

    public void turnOn() {
        setPower(true);
        System.out.println("Fan is spinning");
    }

    public void turnOff() {
        setPower(false);
        System.out.println("Fan stopped");
    }
}