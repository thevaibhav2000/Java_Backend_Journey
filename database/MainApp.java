package database;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("--- Booting Enterprise Microservice Data Layer --- \n");

        // 1. ILLEGAL SECURITY CHECK: 
        // If a developer tries to do this, Java blocks it with an error:
       // DatabaseConnector base = new DatabaseConnector(); // CANNOT instantiate abstract class!

        // 2. DYNAMIC INITIALIZATION: 
        // Let's pretend the configuration file requested "POSTGRES"
        String configEnv = "POSTGRES"; 
        DatabaseConnector db;

        if (configEnv.equalsIgnoreCase("POSTGRES")) {
            db = new PostgresDriver();
        } else {
            db = new MongoDriver();
        }

        // 3. THE LOGIC WORKING BEHIND THE SCENES:
        // The core application runs completely blind! It calls the contract methods.
        db.establishConnection();
        db.logTelemetry("CONNECTED");
        db.executeQuery("SELECT * FROM users WHERE id = 101;");
    }
}