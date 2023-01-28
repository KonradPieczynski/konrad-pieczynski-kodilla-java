package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity()
    {
        //Given
        Country china = new Country(new BigDecimal("1411750000"));
        Country india = new Country(new BigDecimal("1375586000"));
        Country unitedStates = new Country(new BigDecimal("334233854"));
        Country canada = new Country(new BigDecimal("39095373"));
        Country germany = new Country(new BigDecimal("84270625"));
        Country france = new Country(new BigDecimal("68042591"));

        Continent asia = new Continent(Set.of(china,india));
        Continent northAmerica = new Continent(Set.of(unitedStates,canada));
        Continent europe = new Continent(Set.of(germany,france));

        World world = new World(Set.of(asia,northAmerica,europe));
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3312978443");
        assertEquals(peopleQuantity,expectedPeopleQuantity);
    }
}
