package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class FoodOrderRequest {
    private String userName;
    private LocalDateTime dateOfOrder;
    private  String itemName;
    private int amount;

    public FoodOrderRequest(String userName, LocalDateTime dateOfOrder, String itemName, int amount) {
        this.userName = userName;
        this.dateOfOrder = dateOfOrder;
        this.itemName = itemName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAmount() {
        return amount;
    }
}
