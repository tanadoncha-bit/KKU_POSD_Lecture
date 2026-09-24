public class SilverDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}