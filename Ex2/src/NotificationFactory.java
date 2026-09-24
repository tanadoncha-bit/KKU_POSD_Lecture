public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            case "line":
                return new LineNotification();
            case "push":
                return new PushNotification();
            default:
                return null;
        }
    }
}
