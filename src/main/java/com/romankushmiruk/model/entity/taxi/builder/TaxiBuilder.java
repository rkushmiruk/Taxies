package com.romankushmiruk.model.entity.taxi.builder;

import com.romankushmiruk.model.entity.car.CarClass;
import com.romankushmiruk.model.entity.taxi.*;

public abstract class TaxiBuilder {
    public String mark;
    public Integer engineCapacity;
    public CarClass carClazz;
    public Integer fuelPerKm;
    public Integer yearOfIssue;
    public Integer speed;
    public Integer cost;
    public Boolean hasCondition;
    public Integer startPay;
    public Integer payPerKm;


    public TaxiBuilder buildCarClazz() {
        this.carClazz = CarClass.getCarClazz(this.engineCapacity);
        return this;
    }

    public TaxiBuilder mark(String mark) {
        this.mark = mark;
        return this;
    }

    public TaxiBuilder engineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public TaxiBuilder fuelPerKm(Integer fuelPerKm) {

        this.fuelPerKm = fuelPerKm;
        return this;

    }

    public TaxiBuilder yearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
        return this;
    }

    public TaxiBuilder speed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public TaxiBuilder cost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public abstract TaxiBuilder buildCondition();

    public abstract TaxiBuilder buildStartPay();

    public abstract TaxiBuilder buildPayPerKm();

    public abstract Taxi build();

}
