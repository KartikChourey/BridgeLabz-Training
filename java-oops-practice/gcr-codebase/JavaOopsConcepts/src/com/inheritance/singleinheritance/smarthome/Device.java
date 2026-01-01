package com.inheritance.singleinheritance.smarthome;

// Superclass
class Device {

    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}