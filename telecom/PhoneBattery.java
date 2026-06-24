package telecom;

public class PhoneBattery {
    // 1. Private Attribute (Locked down. No outside file can touch this directly)
    private int batteryPercentage;

    // 2. The Constructor (Sets up the phone's initial charge)
    public PhoneBattery(int initialCharge) {
        this.batteryPercentage = initialCharge;
    }

    // 3. GETTER: The public window to safely see the current battery level
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    // 4. SETTER: The security checkpoint that validates data before saving it
    public void setBatteryPercentage(int newCharge) {
        // Industry Best Practice: Reject bad data before it ruins your state!
        if (newCharge < 0 || newCharge > 100) {
            System.out.println("ALERT: Invalid battery percentage rejected (" + newCharge + "%)!");
        } else {
            System.out.println("LOG: Battery updated successfully to " + newCharge + "%.");
            this.batteryPercentage = newCharge;
        }
    }
}