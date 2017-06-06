package com.romankushmiruk.model.entity.taxi.builder;

import static com.romankushmiruk.util.constants.Rate.*;

public class EconomyTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder hasCondition() {
        taxi.setConditioner(false);
        return this;
    }

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

}
