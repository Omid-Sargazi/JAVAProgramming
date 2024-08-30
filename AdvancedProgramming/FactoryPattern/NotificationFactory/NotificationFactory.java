package AdvancedProgramming.FactoryPattern.NotificationFactory;

public class NotificationFactory {
    public Notification geNotification(String notificationType) {
        if (notificationType.equalsIgnoreCase("sms")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        return null;
    }
}
