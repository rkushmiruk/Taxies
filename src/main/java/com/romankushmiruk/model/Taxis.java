package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.factory.TaxiCategory;

import com.romankushmiruk.model.entity.taxi.*;
import com.romankushmiruk.util.iterator.Aggregate;
import com.romankushmiruk.util.iterator.CustomIterator;
import com.romankushmiruk.util.iterator.TaxiIterator;
import com.romankushmiruk.util.TaxiScanner;

import java.util.ArrayList;
import java.util.List;

public class Taxis implements Aggregate {
    private List<Taxi> economyTaxis = new ArrayList<>();
    private List<Taxi> comfortTaxis = new ArrayList<>();
    private List<Taxi> businessTaxis = new ArrayList<>();
    private List<Taxi> premiumTaxis = new ArrayList<>();
    private List<Taxi> allTaxis = new ArrayList<>();

    private Taxis() {
    }

    private static class TaxisHolder {
        private final static Taxis INSTANCE = new Taxis();
    }

    public static Taxis getInstance() {
        return TaxisHolder.INSTANCE;
    }

    @Override
    public CustomIterator createIterator() {
        CustomIterator iterator = new TaxiIterator(this);
        iterator.first();
        return iterator;
    }

    public void addTaxi(TaxiCategory category) {
        Taxi taxi = TaxiScanner.createTaxi(category);
        switch (category) {
            case ECONOMY:
                economyTaxis.add(taxi);
                break;
            case COMFORT:
                comfortTaxis.add(taxi);
                break;
            case BUSINESS:
                businessTaxis.add(taxi);
                break;
            case PREMIUM:
                premiumTaxis.add(taxi);
                break;
        }
        allTaxis.add(taxi);
    }


    public Integer getTaxisCost() {
        int cost = 0;
        for (Taxi taxi : allTaxis) {
            cost += taxi.getCost();
        }
        return cost;
    }

    public void sortTaxi(List<Taxi> taxiList) {
        CustomIterator iterator = createIterator();
        iterator.sortList(taxiList);
    }


    public List<Taxi> searchBetweenSpeed(Integer start, Integer end) {
        List<Taxi> taxis = new ArrayList<>();
        CustomIterator iterator = createIterator();

        while (!iterator.isDone()) {
            if (iterator.currentItem().getSpeed() >= start && iterator.currentItem().getSpeed() <= end) {
                taxis.add(iterator.currentItem());
            }
            iterator.next();
        }
        return taxis;
    }

    public List<Taxi> getEconomyTaxis() {
        return economyTaxis;
    }

    public List<Taxi> getComfortTaxis() {
        return comfortTaxis;
    }

    public List<Taxi> getBusinessTaxis() {
        return businessTaxis;
    }

    public List<Taxi> getPremiumTaxis() {
        return premiumTaxis;
    }

    public List<Taxi> getAllTaxis() {
        return allTaxis;
    }
}
