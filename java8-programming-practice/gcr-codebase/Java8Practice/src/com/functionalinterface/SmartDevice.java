package com.functionalinterface;

interface SmartDevicee {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevicee {
    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class AC implements SmartDevicee {
    public void turnOn() {
        System.out.println("AC ON");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}

class TV implements SmartDevicee {
    public void turnOn() {
        System.out.println("TV ON");
    }

    public void turnOff() {
        System.out.println("TV OFF");
    }
}

public class SmartDevice {
    public static void main(String[] args) {

        SmartDevicee device1 = new Light();
        SmartDevicee device2 = new AC();
        SmartDevicee  device3 = new TV();

        device1.turnOn();
        device2.turnOn();
        device3.turnOn();

        device1.turnOff();
        device2.turnOff();
        device3.turnOff();
    }
}
