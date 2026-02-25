package itinerary;

public class Itinerary {

    // Encapsulated attributes
    private String itineraryName;
    private int numberOfDays;
    private double itineraryPrice;

    // Constructor
    public Itinerary(String itineraryName, int numberOfDays, double itineraryPrice) {
        this.itineraryName = itineraryName;
        this.numberOfDays = numberOfDays;
        this.itineraryPrice = itineraryPrice;
    }

    // Getter for itineraryName
    public String getItineraryName() {
        return itineraryName;
    }

    // Setter for itineraryName
    public void setItineraryName(String itineraryName) {
        this.itineraryName = itineraryName;
    }

    // Getter for numberOfDays
    public int getNumberOfDays() {
        return numberOfDays;
    }

    // Setter for numberOfDays
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    // Getter for itineraryPrice
    public double getItineraryPrice() {
        return itineraryPrice;
    }

    // Setter for itineraryPrice
    public void setItineraryPrice(double itineraryPrice) {
        this.itineraryPrice = itineraryPrice;
    }

    // Method to display itinerary details
    public void displayItinerary() {
        System.out.println("Itinerary: " + itineraryName);
        System.out.println("Duration: " + numberOfDays + " days");
        System.out.println("Itinerary Price: " + itineraryPrice);
    }
}