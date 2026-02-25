package transport;

public class FlightTransport extends Transport {

    // Encapsulated attribute
    private double flightPrice;

    // Constructor
    public FlightTransport(String transportName, double flightPrice) {
        super(transportName); // Call parent constructor
        this.flightPrice = flightPrice;
    }

    // Getter
    public double getFlightPrice() {
        return flightPrice;
    }

    // Setter
    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    // Overriding abstract method
    @Override
    public double getPrice() {
        return flightPrice;
    }

    // Overriding concrete method
    @Override
    public void displayTransport() {
        super.displayTransport(); // Call Transport display
        System.out.println("Flight Price: " + flightPrice);
    }
}