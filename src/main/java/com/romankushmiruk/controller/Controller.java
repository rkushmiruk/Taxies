package com.romankushmiruk.controller;

import com.romankushmiruk.model.Taxis;
import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.view.View;

import java.util.List;

public class Controller {
    private Taxis taxis;

    public Controller(Taxis taxis) {
        this.taxis = taxis;
    }

    public void initTaxis() {
        taxis.addTaxi(TaxiCategory.ECONOMY);
        taxis.addTaxi(TaxiCategory.BUSINESS);
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
