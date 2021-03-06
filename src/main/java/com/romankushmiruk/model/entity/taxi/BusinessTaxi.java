package com.romankushmiruk.model.entity.taxi;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

public class BusinessTaxi extends Taxi {

    public BusinessTaxi(TaxiBuilder builder) {
        super(builder);
        setTaxiCategory(TaxiCategory.BUSINESS);
    }
}
