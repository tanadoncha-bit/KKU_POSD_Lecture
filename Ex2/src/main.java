public class main {
    public static void main(String[] args) throws Exception {
        String[] types = { "email", "sms", "line", "push" };

        for (String type : types) {
            Notification n = NotificationFactory.createNotification(type);
            n.send("System maintenance at 22:00 tonight.");
        }
    }
}