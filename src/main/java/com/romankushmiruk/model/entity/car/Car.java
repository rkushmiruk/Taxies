package com.romankushmiruk.model.entity.car;

public abstract class Car {
    private String mark;
    private Integer engineCapacity;
    private CarClass carClazz;
    private Integer fuelPerHour;
    private Integer yearOfIssue;
    private Integer speed;

    public Car(String mark, Integer engineCapacity, Integer fuelPerHour, Integer yearOfIssue, Integer speed) {
        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.fuelPerHour = fuelPerHour;
        this.yearOfIssue = yearOfIssue;
        this.speed = speed;
    }

    public String getMark() {
        return mark;
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

    public CarClass getCarClazz() {
        return carClazz;
    }

    public void setCarClazz(CarClass carClazz) {
        this.carClazz = carClazz;
    }

    public Integer getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(Integer fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
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
        if (fuelPerHour != null ? !fuelPerHour.equals(car.fuelPerHour) : car.fuelPerHour != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(car.yearOfIssue) : car.yearOfIssue != null) return false;
        return speed != null ? speed.equals(car.speed) : car.speed == null;
    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 67 * result + (engineCapacity != null ? engineCapacity.hashCode() : 0);
        result = 67 * result + (carClazz != null ? carClazz.hashCode() : 0);
        result = 67 * result + (fuelPerHour != null ? fuelPerHour.hashCode() : 0);
        result = 67 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 67 * result + (speed != null ? speed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "mark='" + mark + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", carClazz=" + carClazz +
                ", fuelPerHour=" + fuelPerHour +
                ", yearOfIssue=" + yearOfIssue +
                ", speed=" + speed +
                '}';
    }
}