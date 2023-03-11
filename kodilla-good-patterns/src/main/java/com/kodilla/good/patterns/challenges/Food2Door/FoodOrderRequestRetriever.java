package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class FoodOrderRequestRetriever {
    public FoodOrderRequest retrieve() {
        return new FoodOrderRequest("King Kong", LocalDateTime.of(2023,3,11,12,00),"Banana", 500);
    }
}
