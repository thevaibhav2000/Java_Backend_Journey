package oop_security;

public interface SmartDevice {
    // Rule 1: You must be able to turn on
    void turnOn();
    
    // Rule 2: You must be able to give me your identity badge
    String getDeviceName();
}