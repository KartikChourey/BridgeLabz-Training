package travellog;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class TravelLog {

    public static void main(String[] args) throws Exception {

        // File where trips are stored
        File file = new File("trips.ser");

        // Writing trip data to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(new Trip("Paris", "France", 7));
        oos.writeObject(new Trip("Rome", "Italy", 4));
        oos.writeObject(new Trip("Paris", "France", 3));
        oos.close();

   
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        List<Trip> trips = new ArrayList<>();

        try {
            while (true) {
                trips.add((Trip) ois.readObject());
            }
        } catch (EOFException e) {
            // End of file reached
        }

        ois.close();

        // Set to store unique countries
        Set<String> countries = new HashSet<>();

        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            countries.add(t.country);
            cityCount.put(t.city, cityCount.getOrDefault(t.city, 0) + 1);

            if (t.duration > 5) {
                System.out.println("Long Trip: " + t.city);
            }
        }

   
        cityCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e -> System.out.println("Top City: " + e.getKey()));
    }
}