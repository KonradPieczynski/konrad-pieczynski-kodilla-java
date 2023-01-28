package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    BigDecimal PeopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return Objects.equals(PeopleQuantity, country.PeopleQuantity);
    }

    @Override
    public int hashCode() {
        return PeopleQuantity != null ? PeopleQuantity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "PeopleQuantity=" + PeopleQuantity +
                '}';
    }
}
