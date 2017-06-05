package com.romankushmiruk.model.entity.factory;

import com.romankushmiruk.model.entity.taxi.*;
import com.romankushmiruk.model.entity.taxi.builder.*;

public class TaxiFactory {
    private static TaxiBuilder taxiBuilder;
    private static Taxi taxi;

    public static Taxi createTaxi(TaxiCategory category, String mark, Integer engineCapacity, Integer yearOfIssue, Integer fuelPerHour, Integer speed,Integer cost) {
        switch (category) {
            case ECONOMY:
                taxiBuilder = new EconomyTaxiBuilder();
                taxi = new EconomyTaxi(taxiBuilder);
                break;
            case COMFORT:
                taxiBuilder = new ComfortTaxiBuilder();
                taxi = new ComfortTaxi(taxiBuilder);
                break;
            case BUSINESS:
                taxiBuilder = new BusinessTaxiBuilder();
                taxi = new BusinessTaxi(taxiBuilder);
                break;
            case PREMIUM:
                taxiBuilder = new PremiumTaxiBuilder();
                taxi = new PremiumTaxi(taxiBuilder);
                break;
        }
        taxiBuilder.setTaxi(taxi)
                .mark(mark)
                .engineCapacity(engineCapacity)
                .yearOfIssue(yearOfIssue)
                .fuelPerHour(fuelPerHour)
                .speed(speed)
                .cost(cost)
                .buildTaxiCategory()
                .buildPayPerKm()
                .buildStartPay()
                .buildCarClazz();

        return taxi;
    }

}
