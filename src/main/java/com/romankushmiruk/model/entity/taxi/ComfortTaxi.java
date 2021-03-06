package com.romankushmiruk.model.entity.taxi;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

public class ComfortTaxi extends Taxi {

    public ComfortTaxi(TaxiBuilder builder) {
        super(builder);
        setTaxiCategory(TaxiCategory.COMFORT);
    }
}
