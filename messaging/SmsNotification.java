package messaging;

public class SmsNotification extends Notification {
    @Override
    public void send(String message) {
      System.out.println("SMS GATEWAY -> Sending text message broadcast: [ " + message + " ]");
    }
    
}
