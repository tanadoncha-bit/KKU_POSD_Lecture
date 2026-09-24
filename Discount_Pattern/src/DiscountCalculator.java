public class DiscountCalculator {
    private DiscountStrategy strategy;
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double price) {
        double discount = strategy.calculateDiscount(price);
        return price - discount;
    }
}