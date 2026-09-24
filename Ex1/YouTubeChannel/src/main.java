public class main {
    public static void main(String[] args) throws Exception {
        
        YoutubeChannel channel = new YoutubeChannel();

        Observer User1 = new Subscriber("User1");
        Observer User2 = new Subscriber("User2");
        Observer User3 = new Subscriber("User3");

        channel.registerObserver(User1);
        channel.registerObserver(User2);
        channel.registerObserver(User3);

        channel.upload("Observer Pattern Tutorial");
    }
}
