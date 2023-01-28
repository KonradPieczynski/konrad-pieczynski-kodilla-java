package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class World {
    BigDecimal PeopleQuantity;
    Set<Continent> continents;

    public World(Set<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        PeopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return PeopleQuantity;
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        if (!Objects.equals(PeopleQuantity, world.PeopleQuantity))
            return false;
        return Objects.equals(continents, world.continents);
    }

    @Override
    public int hashCode() {
        int result = PeopleQuantity != null ? PeopleQuantity.hashCode() : 0;
        result = 31 * result + (continents != null ? continents.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "World{" +
                "PeopleQuantity=" + PeopleQuantity +
                ", continents=" + continents +
                '}';
    }
}
