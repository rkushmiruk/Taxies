package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.taxi.EconomyTaxi;

import static com.romankushmiruk.util.constants.Rate.*;

public class EconomyTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildCondition() {
        this.hasCondition = false;
        return this;
    }

    @Override
    public TaxiBuilder buildStartPay() {
        this.startPay = ECONOMY_TAXI_START_RATE;
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        this.payPerKm = ECONOMY_TAXI_PER_KM_RATE;
        return this;
    }

    @Override
    public EconomyTaxi build() {
        return new EconomyTaxi(this);
    }

}
