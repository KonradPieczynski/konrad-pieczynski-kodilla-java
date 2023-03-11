package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderProcessor {
        public void process(FoodOrderInterface interfaceToSupplier,FoodOrderRequest foodOrderRequest){
        interfaceToSupplier.process(foodOrderRequest);
    }
}
