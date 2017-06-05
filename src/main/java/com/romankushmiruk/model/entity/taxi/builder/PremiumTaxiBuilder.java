package com.romankushmiruk.model.entity.taxi.builder;


import com.romankushmiruk.model.entity.factory.TaxiCategory;

import static com.romankushmiruk.util.Rate.*;

public class PremiumTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildStartPay() {
        taxi.setStartPay(PREMIUM_TAXI_START_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        taxi.setPayPerKm(PREMIUM_TAXI_PER_KM_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildTaxiCategory() {
        taxi.setTaxiCategory(TaxiCategory.PREMIUM);
        return this;
    }
}
