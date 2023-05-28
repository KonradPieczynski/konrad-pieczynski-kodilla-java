package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(username + ": New homework from: " + homework.getName() + "\n" +
                " (total: " + homework.getTopics().size() + " homeworks)");
        updateCount++;
    }
}