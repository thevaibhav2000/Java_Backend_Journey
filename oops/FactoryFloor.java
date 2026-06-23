package oops;

public class FactoryFloor {
    public static void main(String[] args) {
        System.out.println("--- Initializing Constructor-Driven Asset Manager --- \n");

        // We now manufacture and initialize our objects in exactly ONE line each!
        SmartComponent component1 = new SmartComponent("Microcontroller (MCU)", "MCU-2026-X8", false);
        SmartComponent component2 = new SmartComponent("LCD Display Panel", "LCD-2026-D4", true);

        System.out.println("Inspecting Asset 1:");
        component1.printSpecifications();

        System.out.println("Inspecting Asset 2:");
        component2.printSpecifications();
    }
}