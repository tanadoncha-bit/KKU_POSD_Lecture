public class Main {
        public static void main(String[] args) {

                ShippingCalculator calculator = new ShippingCalculator();

                calculator.setStrategy(new StandardShipping());
                System.out.println("Standard Shipping : "
                                + calculator.calculateShipping() + " บาท");

                calculator.setStrategy(new ExpressShipping());
                System.out.println("Express Shipping : "
                                + calculator.calculateShipping() + " บาท");

                calculator.setStrategy(new SameDayShipping());
                System.out.println("Same Day Delivery : "
                                + calculator.calculateShipping() + " บาท");
        }
}