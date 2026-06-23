package oops;

public class SmartComponent {
    // 1. Attributes
    String componentType;
    String serialNumber;
    boolean isDefective;

    // 2. The Constructor (The Setup Mold)
    // It accepts parameters and assigns them directly to our class variables
    public SmartComponent(String type, String serial, boolean defective) {
        componentType = type;
        serialNumber = serial;
        isDefective = defective;
    }

    // 3. Behavior
    public void printSpecifications() {
        System.out.println("Component Type: " + componentType);
        System.out.println("Serial Reference: " + serialNumber);
        System.out.println("Defective Status: " + isDefective);
        System.out.println("------------------------------------");
    }
}