package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements FoodOrderInterface{
    @Override
    public void process(FoodOrderRequest foodOrderRequest) {
        System.out.println("HealthyShop:" +
                foodOrderRequest.getUserName()
                + ", ordered " + foodOrderRequest.getItemName()
                + ", quantity: " + foodOrderRequest.getAmount()
                + ", at date: " + foodOrderRequest.getDateOfOrder());
    }
}
