public class LineNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending LINE: " + message);
    }
}
