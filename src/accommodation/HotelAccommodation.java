package accommodation;

public class HotelAccommodation implements Accommodation {

    // Encapsulated attributes
    private String hotelName;
    private double pricePerNight;

    // Constructor
    public HotelAccommodation(String hotelName, double pricePerNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
    }

    // Getter for hotelName
    public String getHotelName() {
        return hotelName;
    }

    // Setter for hotelName
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    // Getter for pricePerNight
    public double getPricePerNight() {
        return pricePerNight;
    }

    // Setter for pricePerNight
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    // Implementing interface method
    @Override
    public double getAccommodationPrice() {
        return pricePerNight;
    }

    // Implementing interface method
    @Override
    public void displayAccommodation() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Price Per Night: " + pricePerNight);
    }
}