public class main {
    public static void main(String[] args) throws Exception {
        // Test Case 1
        Coffee order1 = new Espresso();
        System.out.println("Test Case 1");
        System.out.println("Configuration: Espresso");
        System.out.println("Description: " + order1.getDescription());
        System.out.printf("Total Cost: $%.2f%n%n", order1.getCost());

        // Test Case 2
        Coffee order2 = new MilkDecorator(new Espresso());
        System.out.println("Test Case 2");
        System.out.println("Configuration: Espresso + Milk");
        System.out.println("Description: " + order2.getDescription());
        System.out.printf("Total Cost: $%.2f%n%n", order2.getCost());

        // Test Case 3
        Coffee order3 = new WhippedCreamDecorator(new SugarDecorator(new MilkDecorator(new Americano())));
        System.out.println("Test Case 3");
        System.out.println("Configuration: Americano + Milk + Sugar + Whipped Cream");
        System.out.println("Description: " + order3.getDescription());
        System.out.printf("Total Cost: $%.2f%n", order3.getCost());
    }
}
