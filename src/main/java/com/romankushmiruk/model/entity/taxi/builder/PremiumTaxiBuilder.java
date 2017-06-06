package com.romankushmiruk.model.entity.taxi.builder;

import static com.romankushmiruk.util.constants.Rate.*;

public class PremiumTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder hasCondition() {
        taxi.setConditioner(true);
        return this;
    }

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

}
