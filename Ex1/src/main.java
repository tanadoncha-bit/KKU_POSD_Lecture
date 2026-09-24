public class main {
    public static void main(String[] args) throws Exception {
        Transport t1 = TransportFactory.createTransport("truck");
        Transport t2 = TransportFactory.createTransport("ship");
        Transport t3 = TransportFactory.createTransport("airplane");

        t1.deliver();
        t2.deliver();
        t3.deliver();
    }
}
