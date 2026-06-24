package database;

public class PostgresDriver extends DatabaseConnector {

    @Override
    public void establishConnection() {
        System.out.println("POSTGRES DRIVER -> Opening TCP/IP socket on port 5432...");
        System.out.println("POSTGRES DRIVER -> Authenticating SSL Certificates...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("POSTGRES SQL ENGINE -> Executing relational query: " + query);
    }
}