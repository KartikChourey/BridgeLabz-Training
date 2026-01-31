package com.smartcitytransportandservicemanagementsystem;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCityMain {

    public static void main(String[] args) {

        List<TransportService> services = List.of(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        System.out.println("Available Services (sorted by earliest time):");

        services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .sorted((s1, s2) -> s1.getDepartureTime() - s2.getDepartureTime())
                .forEach(TransportService::printServiceDetails);

      
        System.out.println("\nLive Dashboard:");
        services.forEach(s -> System.out.println(s.getName() + " Active"));

     
        FareCalculator taxiFareCalc = distance -> distance * 15;

        double distance = GeoUtils.calculateDistance(0, 0, 3, 4);
        System.out.println("\nTaxi Fare for distance " + distance + ": "
                + taxiFareCalc.calculateFare(distance));

       
        List<PassengerTrip> trips = List.of(
                new PassengerTrip("A-B", 30, true),
                new PassengerTrip("A-B", 30, false),
                new PassengerTrip("A-C", 120, true),
                new PassengerTrip("A-D", 50, false)
        );

        Map<String, List<PassengerTrip>> tripsByRoute =
                trips.stream()
                     .collect(Collectors.groupingBy(t -> t.route));

        System.out.println("\nTrips Grouped by Route:");
        tripsByRoute.forEach((r, t) ->
                System.out.println(r + " -> " + t.size()));

      
        Map<Boolean, List<PassengerTrip>> peakPartition =
                trips.stream()
                     .collect(Collectors.partitioningBy(t -> t.peakTime));

        System.out.println("\nPeak Trips: " + peakPartition.get(true).size());
        System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());

    
        DoubleSummaryStatistics revenueStats =
                trips.stream()
                     .collect(Collectors.summarizingDouble(t -> t.fare));

        System.out.println("\nRevenue Report:");
        System.out.println("Total: " + revenueStats.getSum());
        System.out.println("Average: " + revenueStats.getAverage());


        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getName() + " PRIORITY ACCESS"));
    }
}
