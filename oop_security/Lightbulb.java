package oop_security;

public class Lightbulb implements SmartDevice {
    
    @Override
    public void turnOn() {
        System.out.println("ACTION: Lighting up the filament to 100%.");
    }

    @Override
    public String getDeviceName() {
        return "Philips Lightbulb";
    }
}