package oops;
public class SmartComponent {
    // 1. Attributes / Properties (State)
    String componentType;
    String serialNumber;
    boolean isDefective;

    // 2. A Method belonging to this asset (Behavior)
    public void printSpecifications() {
        System.out.println("Component Type: " + componentType);
        System.out.println("Serial Reference: " + serialNumber);
        System.out.println("Defective Status: " + isDefective);
        System.out.println("------------------------------------");
    }
}