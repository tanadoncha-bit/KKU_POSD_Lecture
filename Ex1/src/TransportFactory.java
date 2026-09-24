public class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            case "airplane":
                return new Airplane();
            default:
                return  null;
        }
    }
}
