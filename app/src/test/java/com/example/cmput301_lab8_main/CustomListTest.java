package com.example.cmput301_lab8_main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB"); // make new city
        list.addCity(city); // add new city to list
        assertEquals(true, list.hasCity(city)); // True if new city is in list
        assertEquals(false, list.hasCity(new City("Vancouver", "BC"))); // True if Vancouver isn't in list
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount(); // get count of list (0)
        City city = new City("Edmonton", "AB");
        list.addCity(city); // add new city
        assertEquals(list.getCount(), listSize + 1); // confirm list grew by 1
        list.deleteCity(city); // remove added city
        assertEquals(list.getCount(), listSize); // True if list size is original list size, i.e. 0

    }

    @Test
    public void countCitiesTest() {
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.countCities(), listSize + 1);
        list.deleteCity(city);
        assertEquals(list.countCities(), listSize);
    }
}
