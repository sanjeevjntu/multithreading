package com.sanjeev.citrixx.executors;

public class Vehicle {

    private String vin;
    private String make;
    private String model;
    private String year;

    public Vehicle(String vin, String make, String model, String year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (vin != null ? !vin.equals(vehicle.vin) : vehicle.vin != null) return false;
        if (make != null ? !make.equals(vehicle.make) : vehicle.make != null) return false;
        if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) return false;
        return year != null ? year.equals(vehicle.year) : vehicle.year == null;
    }

    @Override
    public int hashCode() {
        int result = vin != null ? vin.hashCode() : 0;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
