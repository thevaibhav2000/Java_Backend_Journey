package oops;

public class FactoryFloor {
    public static void main(String[] args) {
        System.out.println("--- Initializing Encapsulated Asset Manager --- \n");

        // Manufacturing our component using the constructor mold
        SmartComponent component1 = new SmartComponent("Microcontroller (MCU)", "MCU-2026-X8", false);

        // CRITICAL UNDERSTANDING: The line below would now cause a COMPILER ERROR if you untyped the comment:
        // component1.serialNumber = "CORRUPTED_SERIAL"; // Try it! Java will block it because it's private.

        // Instead, we safely read the data using our public Getter method:
        System.out.println("Target Component Serial: " + component1.getSerialNumber());
        
        // We safely modify the data using our public Setter method:
        System.out.println("\nExecuting Quality Re-evaluation...");
        component1.setIsDefective(true); 
        
        // Let's print the final specification report to verify the change
        System.out.println("\nFinal Inspection Report:");
        component1.printSpecifications();
    }
}