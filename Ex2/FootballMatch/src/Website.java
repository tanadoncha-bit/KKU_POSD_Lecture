public class Website implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Website notified");
    }
}
