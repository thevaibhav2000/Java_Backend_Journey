    package oop_security;

public class GoogleHome {
    public static void main(String[] args) {
        
        // 1. Create the devices
        SmartDevice livingRoomLight = new Lightbulb();
        SmartDevice livingRoomTV = new Television();

        // 2. Put them in a network array (The server only sees "SmartDevices")
        SmartDevice[] myHouse = { livingRoomLight, livingRoomTV };

        // 3. The Voice Command: "Turn on the Samsung TV"
        String targetDevice = "Samsung TV";
        System.out.println("USER COMMAND: Turn on the " + targetDevice + "!\n");

        // 4. The Targeted Search Process
        for (int i = 0; i < myHouse.length; i++) {
            
            SmartDevice currentDevice = myHouse[i];
            
            // Ask the device for its name, and check if it matches the target!
            if (currentDevice.getDeviceName().equals(targetDevice)) {
                System.out.println("MATCH FOUND: " + currentDevice.getDeviceName());
                currentDevice.turnOn();
            } else {
                System.out.println("SKIPPING: " + currentDevice.getDeviceName() + " is not the target.");
            }
        }
    }
}