package destination;

public class Destination {

    // Encapsulated attributes
    private String destinationName;
    private String country;

    // Constructor with parameters
    public Destination(String destinationName, String country) {
        this.destinationName = destinationName;
        this.country = country;
    }

    // Getter for destinationName
    public String getDestinationName() {
        return destinationName;
    }

    // Setter for destinationName
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }

    // Method to display destination details
    public void displayDestination() {
        System.out.println("Destination: " + destinationName + ", Country: " + country);
    }
}