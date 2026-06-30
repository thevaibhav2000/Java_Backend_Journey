package oop_security;

public class Television implements SmartDevice {
    
    @Override
    public void turnOn() {
        System.out.println("ACTION: Booting up the 4K LED Screen.");
    }

    @Override
    public String getDeviceName() {
        return "Samsung TV";
    }
}