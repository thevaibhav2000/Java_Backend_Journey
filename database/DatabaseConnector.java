package database;

// Marked 'abstract' because a generic "database" doesn't exist. It's just a concept!
public abstract class DatabaseConnector {

    // MANDATORY CONTRACTS: No code body allowed here! 
    // Every child class MUST write its own specific logic for these methods.
    public abstract void establishConnection();
    public abstract void executeQuery(String query);

    // SHARED CONCRETE METHOD: Every database handles logging the exact same way, 
    // so we write this code once here, and all children inherit it for free!
    public void logTelemetry(String status) {
        System.out.println("METRICS ENGINE -> [TIMESTAMP: 2026] Connection Status: " + status);
    }
}