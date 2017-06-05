package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.factory.TaxiCategory;

import static com.romankushmiruk.util.Rate.*;

public class BusinessTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildStartPay() {
        taxi.setStartPay(BUSINESS_TAXI_START_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        taxi.setPayPerKm(BUSINESS_TAXI_PER_KM_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildTaxiCategory() {
        taxi.setTaxiCategory(TaxiCategory.BUSINESS);
        return this;
    }

}
