package oops;

public class FactoryFloor {
    public static void main(String[] args) {
        System.out.println("--- Initializing Factory Floor Asset Manager --- \n");

        // 1. Create the first object instance using the 'new' keyword
        SmartComponent component1 = new SmartComponent();
        component1.componentType = "Microcontroller (MCU)";
        component1.serialNumber = "MCU-2026-X8";
        component1.isDefective = false;

        // 2. Create a second, completely separate object instance
        SmartComponent component2 = new SmartComponent();
        component2.componentType = "LCD Display Panel";
        component2.serialNumber = "LCD-2026-D4";
        component2.isDefective = true;

        // 3. Trigger their behaviors
        System.out.println("Inspecting Asset 1:");
        component1.printSpecifications();

        System.out.println("Inspecting Asset 2:");
        component2.printSpecifications();
    }
}