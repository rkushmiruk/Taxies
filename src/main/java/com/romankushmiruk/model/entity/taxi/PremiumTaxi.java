package com.romankushmiruk.model.entity.taxi;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

public class PremiumTaxi extends Taxi {

    public PremiumTaxi(TaxiBuilder builder) {
        super(builder);
        setTaxiCategory(TaxiCategory.PREMIUM);
    }
}
