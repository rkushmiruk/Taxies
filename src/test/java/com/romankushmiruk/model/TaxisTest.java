package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.factory.TaxiBuilderFactory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

import com.romankushmiruk.util.iterator.CustomIterator;
import com.romankushmiruk.util.iterator.TaxiIterator;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class TaxisTest {
    private Taxis taxis;
    private TaxiBuilder taxiBuilder;
    private CustomIterator iterator;

    @Before
    public void init() {
        taxis = Taxis.getInstance();
        taxiBuilder = TaxiBuilderFactory.createTaxiBuilder(TaxiCategory.BUSINESS);

        Taxi taxi = taxiBuilder.mark("Split")
                .engineCapacity(23)
                .buildCarClazz()
                .fuelPerKm(23)
                .yearOfIssue(1994)
                .speed(200)
                .buildStartPay()
                .buildPayPerKm()
                .cost(30)
                .buildCondition()
                .build();
        taxis.addTaxi(taxi);

        iterator = new TaxiIterator(taxis);
        iterator.first();
    }

    @Test
    public void taxiCostTest() {
        int actual = taxis.getTaxisCost();
        assertEquals(30, actual);
    }

    @Test
    public void sortTaxi() {
        iterator.sortList(taxis.getAllTaxis());
        int min = taxis.getAllTaxis().get(0).getFuelPerKm();
        for (int i = 1; i < taxis.getAllTaxis().size(); i++) {
            if (min > taxis.getAllTaxis().get(i).getFuelPerKm()) fail("Test fail");
        }
    }

}

