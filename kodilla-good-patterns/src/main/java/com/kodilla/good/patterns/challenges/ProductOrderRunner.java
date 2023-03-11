package com.kodilla.good.patterns.challenges;

public class ProductOrderRunner {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();
        ProductOrderSupplierXyz productOrderSupplierXyz = new ProductOrderSupplierXyz();
        ProductOrderService productOrderService = new ProductOrderService(productOrderSupplierXyz);
        productOrderService.process(productOrderRequest);
    }
}
