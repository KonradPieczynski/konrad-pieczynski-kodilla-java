package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        double resultAdd = calculator.add(2.4,9.1);
        double resultSub = calculator.subtract(2.4,6);

        if (resultAdd == 11.5) {
            System.out.println("Add test OK");
        }
        else {
            System.out.println("Add Error!");
        }
        if (resultSub == -3.6) {
            System.out.println("Subtract test OK");
        }
        else {
            System.out.println("Subtract Error!");
        }
        }
    }
