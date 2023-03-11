package com.kodilla.good.patterns.challenges.FlyFinder;

public class FlyFinderRunner {
    public static void main(String[] args) {
        FlyFinderProcessor flyFinderProcessor = new FlyFinderProcessor();
        flyFinderProcessor.findFlight("Katowice","Krakow");
        flyFinderProcessor.findFlight("Katowice", "Bratyslawa");
        flyFinderProcessor.findFlight("Katowice", "Frankfurt");
    }
}
