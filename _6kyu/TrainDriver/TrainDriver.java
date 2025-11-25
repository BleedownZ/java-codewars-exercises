package _6kyu.TrainDriver;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.HashMap;

public class TrainDriver {
    public static void main(String[] args) {
        String [] route1  = {"Skyport","Oasis","Nexus","Crystalium"};
        String [] route2  = {"Crystalium", "Skyport", "Oasis"};
        String [] route3  = {"Crystalium","Skyport","Oasis","Nexus"};

        System.out.println(arrivalTime(route1,"08:00"));
        System.out.println(arrivalTime(route2, "09:14"));
        System.out.println(arrivalTime(route3, "17:20"));

    }
    public static String arrivalTime(final String[] route, final String departureTime){
        //Values
        double totalTime = 0;
        String origin = "Skyport";
        // Localtime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime time = LocalTime.parse(departureTime, formatter);

        //Data info
        Map<String, double[]> dataInfo = new HashMap<>();
        dataInfo.put("Skyport-Crystalium", new double[]{15, 2 * 60}); // Standby and TripDuration in minutes
        dataInfo.put("Crystalium-Skyport", new double[]{10, 2 * 60});
        dataInfo.put("Skyport-Oasis", new double[]{20, 3 * 60});
        dataInfo.put("Oasis-Skyport", new double[]{15, 3 * 60});
        dataInfo.put("Oasis-Crystalium", new double[]{15, 1.5 * 60});
        dataInfo.put("Crystalium-Oasis", new double[]{10, 1.5 * 60});
        dataInfo.put("Skyport-Nexus", new double[]{15, 4 * 60});
        dataInfo.put("Nexus-Skyport", new double[]{10, 4 * 60});
        // Validate input
        if (route == null || route.length == 0) {
            return "The Train Driver has the day off";
        }

        for (String destination : route) {
            // Check for same city
            if (origin.equals(destination)) {
                totalTime += 60;
                continue;
            }

            String key = origin + "-" + destination;
            if (dataInfo.containsKey(key)) {
                // Direct route
                double[] times = dataInfo.get(key);
                totalTime += times[0] + times[1]; // Add standby and trip duration
                origin = destination; // Update origin
            } else {
                // No direct connection: Go back to Skyport
                String backToSkyport = origin + "-Skyport";
                if (dataInfo.containsKey(backToSkyport)) {
                    double[] times = dataInfo.get(backToSkyport);
                    totalTime += times[0] + times[1]; // Add time to return to Skyport
                    origin = "Skyport"; // Reset to Skyport
                }

                // From Skyport to destination
                String fromSkyportToDest = "Skyport-" + destination;
                if (dataInfo.containsKey(fromSkyportToDest)) {
                    double[] times = dataInfo.get(fromSkyportToDest);
                    totalTime += times[0] + times[1]; // Add standby and trip duration
                    origin = destination; // Update origin
                }
            }
        }

        return String.valueOf(time.plusMinutes((long) totalTime));

    }
}
