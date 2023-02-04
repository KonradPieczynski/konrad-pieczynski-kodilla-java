package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String,Boolean> airports = new HashMap<>();

    public void addAirport(String name, Boolean accessible) {
        airports.put(name, accessible);
    }

    void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airports.containsKey(flight.getArrivalAirport()))  throw new RouteNotFoundException("Arrival airport not found.");
        if (!airports.containsKey(flight.getDepartureAirport())) throw new RouteNotFoundException("Departure airport not found.");
        if (!airports.get(flight.getDepartureAirport())) System.out.println("Cannot depart from:" + flight.getDepartureAirport());
        if (!airports.get(flight.getArrivalAirport())) System.out.println("Cannot fly to:" + flight.getArrivalAirport());
        if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport()))
            System.out.println("You can fly to: " + flight.getDepartureAirport() + " from " + flight.getArrivalAirport());
    }
}
