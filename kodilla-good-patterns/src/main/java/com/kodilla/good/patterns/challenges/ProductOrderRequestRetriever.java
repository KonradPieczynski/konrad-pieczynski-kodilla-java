package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve()
    {
        return new ProductOrderRequest("Janosik", LocalDateTime.of(2023,3,11,12,00),"Złoto", 100);
    }
}
