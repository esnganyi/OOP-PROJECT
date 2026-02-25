package transport;

public class BusTransport extends Transport {

    // Encapsulated attribute
    private double busPrice;

    // Constructor
    public BusTransport(String transportName, double busPrice) {
        super(transportName); // Call parent constructor
        this.busPrice = busPrice;
    }

    // Getter
    public double getBusPrice() {
        return busPrice;
    }

    // Setter
    public void setBusPrice(double busPrice) {
        this.busPrice = busPrice;
    }

    // Overriding abstract method
    @Override
    public double getPrice() {
        return busPrice;
    }

    // Overriding concrete method
    @Override
    public void displayTransport() {
        super.displayTransport(); // Call parent version
        System.out.println("Bus Price: " + busPrice);
    }
}