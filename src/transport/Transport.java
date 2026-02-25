package transport;

public abstract class Transport {

    // Encapsulated attribute
    private String transportName;

    // Constructor
    public Transport(String transportName) {
        this.transportName = transportName;
    }

    // Getter
    public String getTransportName() {
        return transportName;
    }

    // Setter
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double getPrice();

    // Concrete method (can be overridden)
    public void displayTransport() {
        System.out.println("Transport Type: " + transportName);
    }
}