package main;

import destination.Destination;
import transport.Transport;
import transport.BusTransport;
import transport.FlightTransport;
import itinerary.Itinerary;
import accommodation.Accommodation;
import accommodation.HotelAccommodation;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Travel Agency Management System ===");
        System.out.println();

        // Create Destination object
        Destination destination = new Destination("Paris", "France");
        destination.displayDestination();
        System.out.println();

        // Demonstrate inheritance & polymorphism with Transport
        Transport bus = new BusTransport("Luxury Bus", 4500);
        Transport flight = new FlightTransport("International Flight", 45000);

        bus.displayTransport();
        System.out.println("Transport Price: " + bus.getPrice());
        System.out.println();

        flight.displayTransport();
        System.out.println("Transport Price: " + flight.getPrice());
        System.out.println();

        // Create Itinerary object
        Itinerary itinerary = new Itinerary("Paris City Tour", 5, 20000);
        itinerary.displayItinerary();
        System.out.println();

        // Demonstrate interface usage
        Accommodation hotel = new HotelAccommodation("Grand Palace Hotel", 8000);
        hotel.displayAccommodation();
        System.out.println("Accommodation Price: " + hotel.getAccommodationPrice());

        System.out.println();
        System.out.println("=== End of Travel Details ===");
    }
}