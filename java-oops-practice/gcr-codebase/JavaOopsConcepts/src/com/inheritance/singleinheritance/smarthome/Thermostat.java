package com.inheritance.singleinheritance.smarthome;

// Subclass
class Thermostat extends Device {

    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Status: " + (status ? "ON" : "OFF"));
        System.out.println("Temperature Set To: " + temperatureSetting + "°C");
    }
}