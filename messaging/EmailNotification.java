package messaging;

public class EmailNotification extends Notification{
    @Override
    public void send(String message) {
       System.out.println("SMTP EMAIL SERVER -> Generating secure HTML email body: \" " + message + " \"");
    }
    
}
