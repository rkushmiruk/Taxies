package com.romankushmiruk.controller;

import com.romankushmiruk.model.Taxis;
import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.factory.TaxiBuilderFactory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

import java.util.List;

public class Controller {
    private Taxis taxis;
    private TaxiBuilder taxiBuilder;

    public Controller(Taxis taxis) {
        this.taxis = taxis;
    }

    public void initTaxis() {
        taxiBuilder = TaxiBuilderFactory.createTaxiBuilder(TaxiCategory.ECONOMY);

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

    public Integer getTaxisCost() {
        return taxis.getTaxisCost();
    }

    public void sortTaxis(List<Taxi> list) {
        taxis.sortTaxi(list);
    }

    public List<Taxi> searchTaxiBetweenSpeed(int startSpeed, int endSpeed) {
        return taxis.searchBetweenSpeed(startSpeed, endSpeed);
    }


}
