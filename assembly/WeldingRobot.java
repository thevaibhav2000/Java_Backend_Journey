package assembly;

// WeldingRobot INHERITS from BaseMachine
public class WeldingRobot extends BaseMachine {
    // Custom attribute that only welding robots care about
    public double gasLevel; 

    // Custom behavior that only welding robots can execute
    public void executeWeld() {
        System.out.println("ACTION: Robot " + this.machineId + " is welding at gas level " + this.gasLevel + "%.");
    }
}