package com.romankushmiruk.model.entity.factory;

import com.romankushmiruk.model.entity.taxi.builder.*;

public class TaxiBuilderFactory {
    private static TaxiBuilder taxiBuilder;

    public static TaxiBuilder createTaxiBuilder(TaxiCategory category) {
        switch (category) {
            case ECONOMY:
                taxiBuilder = new EconomyTaxiBuilder();
                break;
            case COMFORT:
                taxiBuilder = new ComfortTaxiBuilder();
                break;
            case BUSINESS:
                taxiBuilder = new BusinessTaxiBuilder();
                break;
            case PREMIUM:
                taxiBuilder = new PremiumTaxiBuilder();
                break;
        }

        return taxiBuilder;
    }

}
