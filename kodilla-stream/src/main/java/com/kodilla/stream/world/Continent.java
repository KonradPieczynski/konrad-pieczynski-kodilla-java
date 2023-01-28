package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    Set<Country> countries = new HashSet<Country>();

    public Continent(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return countries != null ? countries.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                '}';
    }
}
