package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String countryName;
    private final BigDecimal population;

    public Country(final String countryName, final  BigDecimal population){
        this.countryName = countryName;
        this.population = population;
    }

    public Country(final String countryName) {
        this(countryName, new BigDecimal("1000000"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(population, country.population);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName, population);
    }

    public BigDecimal getPopulation(){
        return population;
    }
}
