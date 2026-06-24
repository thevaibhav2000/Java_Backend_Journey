package database;

public class MongoDriver extends DatabaseConnector {

    @Override
    public void establishConnection() {
        System.out.println("MONGO DRIVER -> Connecting to distributed cluster on port 27017...");
        System.out.println("MONGO DRIVER -> Parsing BSON connection string secrets...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("MONGO NO-SQL ENGINE -> Querying JSON Document collection for: " + query);
    }
}