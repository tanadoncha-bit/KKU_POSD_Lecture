public class SameDayShipping implements ShippingStrategy {
    @Override
    public double calculateCost() {
        return 200;
    }
}