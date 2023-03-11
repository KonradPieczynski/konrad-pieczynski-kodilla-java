package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements FoodOrderInterface{

    @Override
    public void process(FoodOrderRequest foodOrderRequest) {
        System.out.println("ExtraFoodShop:" +
                foodOrderRequest.getUserName()
                + ", ordered " + foodOrderRequest.getItemName()
                + ", quantity: " + foodOrderRequest.getAmount()
                + ", at date: " + foodOrderRequest.getDateOfOrder());
    }
}
