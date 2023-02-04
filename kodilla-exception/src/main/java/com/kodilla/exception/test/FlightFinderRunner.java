package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addAirport("Katowice", true);
        flightFinder.addAirport("Kraków", true);
        try {
            flightFinder.findFlight(new Flight("Katowice","Kraków"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }
        try {
            flightFinder.findFlight(new Flight("Katowice","Frankfurt"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }
        try {
            flightFinder.findFlight(new Flight("Warszawa","Kraków"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }
    }
}
