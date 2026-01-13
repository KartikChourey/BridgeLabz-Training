package homenest;

abstract class Device {

    protected String deviceId;
    private boolean status;            // Encapsulated
    protected double energyUsage;

    // Secure firmware logs
    private String firmwareLog = "v1.0";

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    // Energy calculation using operators
    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }
}
