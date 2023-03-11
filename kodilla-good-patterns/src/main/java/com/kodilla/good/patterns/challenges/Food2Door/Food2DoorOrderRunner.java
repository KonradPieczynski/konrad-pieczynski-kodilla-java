package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorOrderRunner {
    public static void main(String[] args) {
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();
        SupplierList supplierList = new SupplierList();
        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor();
        foodOrderProcessor.process(supplierList.getSupplier(0),foodOrderRequest);
        foodOrderProcessor.process(supplierList.getSupplier(1),foodOrderRequest);
        foodOrderProcessor.process(supplierList.getSupplier(2),foodOrderRequest);
    }
}
