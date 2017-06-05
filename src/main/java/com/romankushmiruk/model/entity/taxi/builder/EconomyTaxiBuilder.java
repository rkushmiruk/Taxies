package com.romankushmiruk.model.entity.taxi.builder;


import com.romankushmiruk.model.entity.factory.TaxiCategory;

import static com.romankushmiruk.util.Rate.*;

public class EconomyTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildStartPay() {
        taxi.setStartPay(ECONOMY_TAXI_START_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        taxi.setPayPerKm(ECONOMY_TAXI_PER_KM_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildTaxiCategory() {
        taxi.setTaxiCategory(TaxiCategory.ECONOMY);
        return this;
    }

}
