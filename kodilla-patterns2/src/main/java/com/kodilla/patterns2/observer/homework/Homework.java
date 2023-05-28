package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable{
    private final List<Observer> observers;
    private final List<String> topics;
    private final String name;

    public Homework(String name) {
        observers = new ArrayList<>();
        topics = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        topics.add(post);
        notifyObservers();
    }

    public List<String> getTopics() {
        return topics;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}