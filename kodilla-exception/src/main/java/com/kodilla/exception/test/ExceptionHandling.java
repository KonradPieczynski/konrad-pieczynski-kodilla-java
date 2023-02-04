package com.kodilla.exception.test;

public class ExceptionHandling {
    SecondChallenge secondChallenge = new SecondChallenge();
    String result;
    {
        try {
            result = secondChallenge.probablyIWillThrowException(1.0,1.0);
        } catch (Exception e) {
            System.out.println("Invalid input data.");
        }
        finally {
            System.out.println("Finished!");
        }
    }
}
