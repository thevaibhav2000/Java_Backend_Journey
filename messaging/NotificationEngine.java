package messaging;

public class NotificationEngine {
   public static void main(String[] args) {
    Notification accountalert = new SmsNotification();
    Notification invoicealert = new EmailNotification();

    System.out.println("Executing Broadcast 1");

    accountalert.send("Your OTP security code is 9852.");
    invoicealert.send("Your corporate invoice for June 2026 is ready.");
   }
}

