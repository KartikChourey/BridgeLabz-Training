package com.lambdaexpression;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLight {
    public static void main(String[] args) {

        LightAction motionTrigger = () ->
                System.out.println("Lights ON at full brightness due to motion");

        LightAction nightTimeTrigger = () ->
                System.out.println("Lights ON at low brightness for night mode");

        LightAction voiceCommandTrigger = () ->
                System.out.println("Lights set to custom color via voice command");

        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceCommandTrigger.activate();
    }
}
