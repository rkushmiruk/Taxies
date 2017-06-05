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

    public Taxi(TaxiBuilder builder){
        super(builder.mark,builder.engineCapacity,builder.fuelPerHour,builder.yearOfIssue,builder.speed);
        isBusy = false;
    }

    public TaxiCategory getTaxiCategory() {
        return taxiCategory;
    }

    public void setTaxiCategory(TaxiCategory taxiCategory) {
        this.taxiCategory = taxiCategory;
    }

    public Integer getStartPay() {
        return startPay;
    }

    public void setStartPay(Integer startPay) {
        this.startPay = startPay;
    }

    public Integer getPayPerKm() {
        return payPerKm;
    }

    public void setPayPerKm(Integer payPerKm) {
        this.payPerKm = payPerKm;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
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

        return "Taxi {" + super.toString()+
                "category="+taxiCategory+
                "startPay=" + startPay +
                ", payPerKm=" + payPerKm +
                ", cost="+cost+
                '}';
    }
}
