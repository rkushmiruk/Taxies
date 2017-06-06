package com.romankushmiruk.model.entity.car;

public abstract class Car {
    private String mark;
    private Integer engineCapacity;
    private CarClass carClazz;
    private Integer fuelPerKm;
    private Integer yearOfIssue;
    private Integer speed;

    public Car(String mark, Integer engineCapacity, Integer fuelPerKm, Integer yearOfIssue, Integer speed) {
        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.fuelPerKm = fuelPerKm;
        this.yearOfIssue = yearOfIssue;
        this.speed = speed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setCarClazz(CarClass carClazz) {
        this.carClazz = carClazz;
    }

    public Integer getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerHour(Integer fuelPerHour) {
        this.fuelPerKm = fuelPerHour;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        if (engineCapacity != null ? !engineCapacity.equals(car.engineCapacity) : car.engineCapacity != null)
            return false;
        if (carClazz != car.carClazz) return false;
        if (fuelPerKm != null ? !fuelPerKm.equals(car.fuelPerKm) : car.fuelPerKm != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(car.yearOfIssue) : car.yearOfIssue != null) return false;
        return speed != null ? speed.equals(car.speed) : car.speed == null;
    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 67 * result + (engineCapacity != null ? engineCapacity.hashCode() : 0);
        result = 67 * result + (carClazz != null ? carClazz.hashCode() : 0);
        result = 67 * result + (fuelPerKm != null ? fuelPerKm.hashCode() : 0);
        result = 67 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 67 * result + (speed != null ? speed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return new StringBuilder()
                .append("mark='")
                .append(mark)
                .append('\'')
                .append(", engineCapacity=")
                .append(engineCapacity)
                .append(", carClazz=")
                .append(carClazz)
                .append(", fuelPerKm=")
                .append(fuelPerKm).append(", yearOfIssue=")
                .append(yearOfIssue)
                .append(", speed=")
                .append(speed).toString();
    }
}