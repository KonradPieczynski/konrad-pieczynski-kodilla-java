package com.kodilla.good.patterns.challenges.FlyFinder;

import java.util.HashSet;

public class FlyList {
    HashSet<Flight> flights = new HashSet<>();

    public FlyList() {
        flights.add(new Flight("Katowice","Krakow"));
        flights.add(new Flight("Katowice","Warszawa"));
        flights.add(new Flight("Krakow","Frankfurt"));
        flights.add(new Flight("Frankfurt","Amsterdam"));
    }

    public HashSet<Flight> getFlights() {
        return flights;
    }
}
