package AdvancedProgramming.FactoryPattern.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification sms = notificationFactory.geNotification("sms");
        sms.notifyUser();
    }
}
