package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.taxi.*;



import java.util.ArrayList;
import java.util.List;

public class Taxis {
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

    public void addTaxi(Taxi taxi) {
        switch (taxi.getTaxiCategory()) {
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

    public Integer taxisCost() {
        int cost = 0;
        for (Taxi economyTaxi : economyTaxis) {
            cost += economyTaxi.getCost();
        }
        for (Taxi comfortTaxi : comfortTaxis) {
            cost += comfortTaxi.getCost();
        }
        for (Taxi businessTaxi : businessTaxis) {
            cost += businessTaxi.getCost();
        }
        for (Taxi premiumTaxi : premiumTaxis) {
            cost += premiumTaxi.getCost();
        }
        return cost;
    }

    public void sortTaxi() {

    }

    public List<Taxi> searchBetweenSpeed(Integer start,Integer end){
        List<Taxi> taxis = new ArrayList<>();
        for(Taxi taxi: allTaxis){
            if(start<=taxi.getSpeed()&& taxi.getSpeed()>=end){
                taxis.add(taxi);
            }
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
