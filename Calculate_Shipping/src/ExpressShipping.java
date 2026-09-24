public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost() {
        return 100;
    }
}