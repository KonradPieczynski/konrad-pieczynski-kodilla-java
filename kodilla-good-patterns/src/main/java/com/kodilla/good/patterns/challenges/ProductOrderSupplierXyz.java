package com.kodilla.good.patterns.challenges;

public class ProductOrderSupplierXyz implements ProductOrderInterface{
    @Override
    public void process(ProductOrderRequest productOrderRequest) {
        System.out.println(productOrderRequest.getUserName()
                + ", ordered " + productOrderRequest.getItemName()
                + ", quantity: " + productOrderRequest.getAmount()
                + ", at date: " + productOrderRequest.getDateOfOrder());
    }
}
