package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.taxi.ComfortTaxi;

import static com.romankushmiruk.util.constants.Rate.*;

public class ComfortTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildCondition() {
        this.hasCondition = true;
        return this;
    }

    @Override
    public TaxiBuilder buildStartPay() {
        this.startPay = COMFORT_TAXI_START_RATE;
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        this.payPerKm = COMFORT_TAXI_PER_KM_RATE;
        return this;
    }

    @Override
    public ComfortTaxi build() {
        return new ComfortTaxi(this);
    }

}
