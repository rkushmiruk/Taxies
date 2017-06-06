package com.romankushmiruk.model.entity.taxi.builder;

import static com.romankushmiruk.util.constants.Rate.*;

public class ComfortTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder hasCondition() {
        taxi.setConditioner(true);
        return this;
    }

    @Override
    public TaxiBuilder buildStartPay() {
        taxi.setStartPay(COMFORT_TAXI_START_RATE);
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        taxi.setPayPerKm(COMFORT_TAXI_PER_KM_RATE);
        return this;
    }

}
