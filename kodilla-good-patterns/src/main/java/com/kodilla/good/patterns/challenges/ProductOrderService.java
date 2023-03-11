package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final ProductOrderInterface interfaceToSupplier;

    public ProductOrderService(ProductOrderInterface interfaceToSupplier) {
        this.interfaceToSupplier = interfaceToSupplier;
    }
    public void process(ProductOrderRequest productOrderRequest){
        interfaceToSupplier.process(productOrderRequest);
    }
}
