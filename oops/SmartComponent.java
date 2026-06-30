package oops;

public class SmartComponent {
    // 1. Private Attributes (Locked completely from direct outside access)
    private String componentType;
    private String serialNumber;
    private boolean isDefective;

    // 2. The Constructor (Still handles initial manufacturing setup)
    public SmartComponent(String type, String serial, boolean defective) {
        // 'this' refers to the private variables above
        this.componentType = type;
        this.serialNumber = serial;
        this.isDefective = defective;
    }

    // 3. GETTER Method: A safe, public exit door to READ the serial number
    public String getSerialNumber() {
        return this.serialNumber;
    }

    // 4. SETTER Method: A safe, public entrance door to UPDATE the defective status
    public void setIsDefective(boolean defective) {
        // In the real industry, we put business validation logic right here!
        System.out.println("LOG: Securely updating defective status for component " + this.serialNumber);
        this.isDefective = defective;
    }

    // 5. Public Behavior Method
    public void printSpecifications() {
        System.out.println("Component Type: " + this.componentType);
        System.out.println("Serial Reference: " + this.serialNumber);
        System.out.println("Defective Status: " + this.isDefective);
        System.out.println("------------------------------------");
    }
}