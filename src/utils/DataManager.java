package utils;

import java.io.*;
import java.util.ArrayList;
import destination.Destination;

public class DataManager {

    private static final String FILE_NAME = "destinations.txt";

    // Save destinations to file
    public static void saveDestinations(ArrayList<Destination> destinations) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Destination d : destinations) {
                writer.write(d.getDestinationName() + "," + d.getCountry());
                writer.newLine();
            }

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    // Load destinations from file
    public static ArrayList<Destination> loadDestinations() {

        ArrayList<Destination> destinations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length == 2) {
                    Destination d = new Destination(parts[0], parts[1]);
                    destinations.add(d);
                }
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return destinations;
    }
}