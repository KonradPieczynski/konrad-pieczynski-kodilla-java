package com.kodilla.good.patterns.challenges.FlyFinder;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class FlyFinderProcessor {
    FlyList flyList = new FlyList();
    ArrayList<String> route = new ArrayList<>();
    public void findFlight(String source, String destination){
        Set<String> sources = flyList.getFlights().stream()
                .map(Flight::getSource)
                .filter(src-> !Objects.equals(src, destination))
                .collect(Collectors.toSet());
        Set<String> destinations = flyList.getFlights().stream()
                .map(Flight::getDestination)
                .filter(dst-> !Objects.equals(dst, source))
                .collect(Collectors.toSet());
        if (sources.contains(source) && destinations.contains(destination))
        {
            if (flyList.getFlights().contains(new Flight(source,destination)))
            {
                System.out.println("from " + source + " to: " + destination);
            }
            else {
                System.out.println("from " + source + " to: " + destination + " via flight: ");
                sources.stream().filter(src -> !Objects.equals(src, source)).forEach(a -> findFlight(source, a));
            }
        }
        else {
            System.out.println("Cannot fly to:" + destination + " from " + source);
        }
    }
}
