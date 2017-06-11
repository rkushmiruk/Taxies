package com.romankushmiruk.model.entity.taxi;

import com.romankushmiruk.model.entity.car.Car;
import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;

public class Taxi extends Car {
    private TaxiCategory taxiCategory;
    private Integer startPay;
    private Integer payPerKm;
    private Boolean isBusy;
    private Integer cost;
    private Boolean hasConditioner;

    public Taxi(TaxiBuilder builder) {
        super(builder.mark, builder.engineCapacity, builder.fuelPerKm, builder.yearOfIssue, builder.speed, builder.carClazz);
        startPay = builder.startPay;
        payPerKm = builder.payPerKm;
        cost = builder.cost;
        hasConditioner = builder.hasCondition;
        isBusy = false;
    }

    public void setTaxiCategory(TaxiCategory taxiCategory) {
        this.taxiCategory = taxiCategory;
    }

    public Integer getCost() {
        return cost;
    }

    public TaxiCategory getTaxiCategory() {
        return taxiCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Taxi taxi = (Taxi) o;

        if (startPay != null ? !startPay.equals(taxi.startPay) : taxi.startPay != null) return false;
        if (payPerKm != null ? !payPerKm.equals(taxi.payPerKm) : taxi.payPerKm != null) return false;
        return isBusy != null ? isBusy.equals(taxi.isBusy) : taxi.isBusy == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (startPay != null ? startPay.hashCode() : 0);
        result = 31 * result + (payPerKm != null ? payPerKm.hashCode() : 0);
        result = 31 * result + (isBusy != null ? isBusy.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return new StringBuilder().append("Taxi {").
                append(super.toString())
                .append(" , category=")
                .append(taxiCategory)
                .append(" , startPay=")
                .append(startPay)
                .append(", payPerKm=")
                .append(payPerKm)
                .append(", cost=")
                .append(cost)
                .append(", Conditioner=")
                .append(hasConditioner)
                .append('}').toString();
    }
}
