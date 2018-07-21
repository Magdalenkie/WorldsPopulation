package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfContinentsOnWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listOfContinentsOnWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal populationOnTheWorld = listOfContinentsOnWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .distinct()
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));

        return populationOnTheWorld;
    }
}
