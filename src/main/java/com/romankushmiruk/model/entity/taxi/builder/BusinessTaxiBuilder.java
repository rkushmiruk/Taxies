package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.taxi.BusinessTaxi;

import static com.romankushmiruk.util.constants.Rate.*;

public class BusinessTaxiBuilder extends TaxiBuilder {
    @Override
    public TaxiBuilder buildCondition() {
        this.hasCondition = true;
        return this;
    }

    @Override
    public TaxiBuilder buildStartPay() {
        this.startPay = BUSINESS_TAXI_START_RATE;
        return this;
    }

    @Override
    public TaxiBuilder buildPayPerKm() {
        this.payPerKm = BUSINESS_TAXI_PER_KM_RATE;
        return this;
    }

    @Override
    public BusinessTaxi build() {
        return new BusinessTaxi(this);
    }

}
