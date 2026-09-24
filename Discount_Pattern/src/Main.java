public class Main {
        public static void main(String[] args) {
                double price = 1000;
                DiscountCalculator calculator = new DiscountCalculator();
                calculator.setStrategy(new SilverDiscount());
                System.out.println("Silver Member : "
                                + calculator.calculatePrice(price) + " บาท");

                calculator.setStrategy(new GoldDiscount());
                System.out.println("Gold Member : "
                                + calculator.calculatePrice(price) + " บาท");

                calculator.setStrategy(new PlatinumDiscount());
                System.out.println("Platinum Member : "
                                + calculator.calculatePrice(price) + " บาท");
        }
}