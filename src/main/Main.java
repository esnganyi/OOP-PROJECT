package main;

import java.util.Scanner;

import destination.Destination;
import transport.Transport;
import transport.BusTransport;
import transport.FlightTransport;
import itinerary.Itinerary;
import accommodation.Accommodation;
import accommodation.HotelAccommodation;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("=== Travel Agency Management System ===");

            // User enters destination
            System.out.print("Enter destination name: ");
            String destinationName = scanner.nextLine();

            System.out.print("Enter country: ");
            String country = scanner.nextLine();

            Destination destination = new Destination(destinationName, country);
            destination.displayDestination();

            System.out.println();

            // Choose transport
            System.out.println("Choose transport type:");
            System.out.println("1. Bus");
            System.out.println("2. Flight");
            System.out.print("Enter choice: ");

            int transportChoice = scanner.nextInt();

            Transport transport;

            if (transportChoice == 1) {

                System.out.print("Enter bus price: ");
                double busPrice = scanner.nextDouble();

                transport = new BusTransport("Bus Transport", busPrice);

            } else if (transportChoice == 2) {

                System.out.print("Enter flight price: ");
                double flightPrice = scanner.nextDouble();

                transport = new FlightTransport("Flight Transport", flightPrice);

            } else {

                System.out.println("Invalid transport choice. Defaulting to Bus.");
                transport = new BusTransport("Bus Transport", 0);

            }

            transport.displayTransport();
            System.out.println("Transport Price: " + transport.getPrice());

            System.out.println();

            // Itinerary input
            scanner.nextLine(); // clear buffer

            System.out.print("Enter itinerary name: ");
            String itineraryName = scanner.nextLine();

            System.out.print("Enter number of days: ");
            int numberOfDays = scanner.nextInt();

            System.out.print("Enter itinerary price: ");
            double itineraryPrice = scanner.nextDouble();

            Itinerary itinerary = new Itinerary(itineraryName, numberOfDays, itineraryPrice);
            itinerary.displayItinerary();

            System.out.println();

            // Accommodation
            scanner.nextLine();

            System.out.print("Enter hotel name: ");
            String hotelName = scanner.nextLine();

            System.out.print("Enter price per night: ");
            double pricePerNight = scanner.nextDouble();

            Accommodation hotel = new HotelAccommodation(hotelName, pricePerNight);
            hotel.displayAccommodation();

            System.out.println("Accommodation Price: " + hotel.getAccommodationPrice());

        }

        catch (Exception e) {

            System.out.println("Error: Invalid input detected.");
            System.out.println("Please enter the correct data type.");

        }

        finally {

            scanner.close();
            System.out.println("Program ended safely.");

        }
    }
}