package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.car.CarClass;
import com.romankushmiruk.model.entity.taxi.*;

public abstract class TaxiBuilder {
    protected Taxi taxi;
    public String mark;
    public Integer engineCapacity;
    public Integer fuelPerHour;
    public Integer yearOfIssue;
    public Integer speed;
    public Integer cost;
    public Boolean hasCondition;

    public Taxi getTaxi() {
        return taxi;
    }

    public TaxiBuilder setTaxi(Taxi taxi) {
        this.taxi = taxi;
        return this;
    }

    public TaxiBuilder buildCarClazz() {
        taxi.setCarClazz(CarClass.getCarClazz(taxi.getEngineCapacity()));
        return this;
    }

    public TaxiBuilder mark(String mark) {
        taxi.setMark(mark);
        return this;
    }

    public TaxiBuilder engineCapacity(Integer engineCapacity) {
        taxi.setEngineCapacity(engineCapacity);
        return this;
    }

    public TaxiBuilder fuelPerKm(Integer fuelPerKm) {
        taxi.setFuelPerHour(fuelPerKm);
        return this;

    }

    public TaxiBuilder yearOfIssue(Integer yearOfIssue) {
        taxi.setYearOfIssue(yearOfIssue);
        return this;
    }

    public TaxiBuilder speed(Integer speed) {
        taxi.setSpeed(speed);
        return this;
    }

    public TaxiBuilder cost(Integer cost) {
        taxi.setCost(cost);
        return this;
    }

    public abstract TaxiBuilder hasCondition();

    public abstract TaxiBuilder buildStartPay();

    public abstract TaxiBuilder buildPayPerKm();

}
