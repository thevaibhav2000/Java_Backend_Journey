package assembly;

public class BaseMachine {
    // Shared attributes
    public String machineId;
    public boolean isOperational;

    // Shared behavior
    public void startMachine() {
        this.isOperational = true;
        System.out.println("LOG: Machine " + this.machineId + " is now powered UP.");
    }
}