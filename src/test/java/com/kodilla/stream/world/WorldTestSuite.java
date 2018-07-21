package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent afrika = new Continent("Afrika");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");

        Country cameroon = new Country("Cameroon");
        Country egypt = new Country("Egypt");
        Country marocco = new Country("Marocco");
        Country china = new Country("China");
        Country india = new Country("India");
        Country singapore = new Country("Singapore");
        Country poland = new Country("Poland");
        Country czech = new Country("Chech");
        Country hungary = new Country("Hungary");

        world.addContinent(afrika);
        world.addContinent(asia);
        world.addContinent(europe);

        afrika.addCountry(cameroon);
        afrika.addCountry(egypt);
        afrika.addCountry(marocco);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(singapore);

        europe.addCountry(poland);
        europe.addCountry(czech);
        europe.addCountry(hungary);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then

        BigDecimal totalPeopleExpected = new BigDecimal("9000000");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
