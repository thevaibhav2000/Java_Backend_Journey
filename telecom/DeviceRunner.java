package telecom;

public class DeviceRunner {
    public static void main(String[] args) {
        System.out.println("--- Booting Device OS --- \n");

        // 1. Create a phone starting at 50% battery
        PhoneBattery myPhone = new PhoneBattery(50);

        // 2. Read the battery level using our safe public GETTER window
        System.out.println("Initial Battery Screen Display: " + myPhone.getBatteryPercentage() + "%");

        // 3. Let's simulate plugging in a charger using a valid SETTER update
        System.out.println("\nPlugging in charger...");
        myPhone.setBatteryPercentage(85); 

        // 4. MALICIOUS / ACCIDENTAL CORRUPTION TEST
        // If we tried to do: myPhone.batteryPercentage = 999; Java would block us with a compiler error!
        // Instead, let's see how our setter catches a bad system glitch:
        System.out.println("\nSystem power surge anomaly detected...");
        myPhone.setBatteryPercentage(150); // This should trigger our security validation guardrail!

        // 5. Check the final battery status to prove it wasn't corrupted
        System.out.println("\nFinal Battery Screen Display: " + myPhone.getBatteryPercentage() + "%");
    }
}