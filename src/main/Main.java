package main;

import java.util.Scanner;
import java.util.ArrayList;

import destination.Destination;
import transport.Transport;
import transport.BusTransport;
import transport.FlightTransport;
import itinerary.Itinerary;
import accommodation.Accommodation;
import accommodation.HotelAccommodation;
import utils.DataManager;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Collection to store destinations
        ArrayList<Destination> destinations = DataManager.loadDestinations();

        try {

            System.out.println("=== Travel Agency Management System ===");
            System.out.println();

            // Show previously saved destinations
            if (!destinations.isEmpty()) {
                System.out.println("Previously Saved Destinations:");
                for (Destination d : destinations) {
                    d.displayDestination();
                }
                System.out.println();
            }

            // USER INPUT (replaces hardcoded Paris)
            System.out.print("Enter destination name: ");
            String destinationName = scanner.nextLine();

            System.out.print("Enter country: ");
            String country = scanner.nextLine();

            Destination destination = new Destination(destinationName, country);
            destinations.add(destination);
            destination.displayDestination();
            System.out.println();

            // Transport choice
            System.out.println("Choose transport type:");
            System.out.println("1. Bus");
            System.out.println("2. Flight");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            Transport transport;

            if (choice == 1) {

                System.out.print("Enter bus price: ");
                double busPrice = scanner.nextDouble();

                transport = new BusTransport("Bus", busPrice);

            } else if (choice == 2) {

                System.out.print("Enter flight price: ");
                double flightPrice = scanner.nextDouble();

                transport = new FlightTransport("Flight", flightPrice);

            } else {

                System.out.println("Invalid choice. Defaulting to Bus.");
                transport = new BusTransport("Bus", 0);
            }

            transport.displayTransport();
            System.out.println("Transport Price: " + transport.getPrice());
            System.out.println();

            scanner.nextLine(); // clear buffer

            // Itinerary input
            System.out.print("Enter itinerary name: ");
            String itineraryName = scanner.nextLine();

            System.out.print("Enter number of days: ");
            int numberOfDays = scanner.nextInt();

            System.out.print("Enter itinerary price: ");
            double itineraryPrice = scanner.nextDouble();

            Itinerary itinerary = new Itinerary(itineraryName, numberOfDays, itineraryPrice);
            itinerary.displayItinerary();
            System.out.println();

            scanner.nextLine(); // clear buffer

            // Accommodation input
            System.out.print("Enter hotel name: ");
            String hotelName = scanner.nextLine();

            System.out.print("Enter price per night: ");
            double pricePerNight = scanner.nextDouble();

            Accommodation hotel = new HotelAccommodation(hotelName, pricePerNight);
            hotel.displayAccommodation();
            System.out.println("Accommodation Price: " + hotel.getAccommodationPrice());

            System.out.println();

            // SAVE DATA TO FILE
            DataManager.saveDestinations(destinations);

            System.out.println("=== End of Travel Details ===");

        } catch (Exception e) {

            System.out.println("Error: Invalid input detected.");
            System.out.println("Please enter correct data types.");

        } finally {

            scanner.close();
            System.out.println("Program ended safely.");
        }
    }
}