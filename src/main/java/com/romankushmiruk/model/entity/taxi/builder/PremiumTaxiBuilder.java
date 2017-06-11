package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.taxi.PremiumTaxi;

import static com.romankushmiruk.util.constants.Rate.*;

public class PremiumTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildCondition() {
        this.hasCondition = true;
        return this;
    }

    @Override
    public TaxiBuilder buildStartPay() {
        this.startPay = PREMIUM_TAXI_START_RATE;
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        this.payPerKm = PREMIUM_TAXI_PER_KM_RATE;
        return this;
    }

    @Override
    public PremiumTaxi build() {
        return new PremiumTaxi(this);
    }
}
