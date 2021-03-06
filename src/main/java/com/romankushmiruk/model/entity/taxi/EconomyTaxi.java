package com.romankushmiruk.model.entity.taxi;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

public class EconomyTaxi extends Taxi {

    public EconomyTaxi(TaxiBuilder builder) {
        super(builder);
        setTaxiCategory(TaxiCategory.ECONOMY);
    }
}
