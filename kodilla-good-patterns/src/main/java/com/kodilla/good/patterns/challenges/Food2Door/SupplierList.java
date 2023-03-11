package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class SupplierList {
    ArrayList<FoodOrderInterface> suppliers = new ArrayList<>();
    public SupplierList() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        suppliers.add(extraFoodShop);
        suppliers.add(glutenFreeShop);
        suppliers.add(healthyShop);
    }

    public FoodOrderInterface getSupplier(int supplierID){
        return suppliers.get(supplierID);
    }
}
