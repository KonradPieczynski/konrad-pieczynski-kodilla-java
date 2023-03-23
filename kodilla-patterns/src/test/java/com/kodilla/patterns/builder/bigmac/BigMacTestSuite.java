package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void testBigMacNew(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("White")
                .sauce("Garlic")
                .burgers(2)
                .ingredient("Cheese")
                .ingredient("Tomato")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(2,howManyIngredients);
    }
}
