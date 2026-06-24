package assembly;

public class AssemblyLine {
    public static void main(String[] args) {
        System.out.println("--- Starting Automated Assembly Line --- \n");

        // Create an instance of our specialized subclass
        WeldingRobot robot1 = new WeldingRobot();

        // 1. Look at this! machineId comes directly from BaseMachine!
        robot1.machineId = "WELD-ROBOT-01"; 
        
        // 2. gasLevel comes from its own specialized WeldingRobot class
        robot1.gasLevel = 94.5;

        // 3. Trigger the inherited behavior from the parent class
        robot1.startMachine();

        // 4. Trigger the custom behavior from the subclass
        robot1.executeWeld();
    }
}