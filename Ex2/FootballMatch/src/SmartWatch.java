public class SmartWatch implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Smart Watch notified");
    }
}
