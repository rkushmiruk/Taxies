package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.factory.TaxiFactory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxisTest {
    Taxis taxis;
    TaxiBuilder taxiBuilder;

    @Before
    public void init() {
        taxis = Taxis.getInstance();
        taxiBuilder = TaxiFactory.createTaxiBuilder(TaxiCategory.BUSINESS);
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
    }

    @Test
    public void taxiCostTest(){
        int  actual = taxis.getTaxisCost();
        assertEquals(30,actual);
    }


}

