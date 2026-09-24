public class main {
    public static void main(String[] args) throws Exception {
        FootballMatch match = new FootballMatch("Team A", "Team B");

        Observer mobileApp = new MobileApp();
        Observer website = new Website();
        Observer smartWatch = new SmartWatch();

        match.registerObserver(mobileApp);
        match.registerObserver(website);
        match.registerObserver(smartWatch);

        match.startMatch();
        match.scoreGoal("Team A");
        match.endMatch();
    }
}
