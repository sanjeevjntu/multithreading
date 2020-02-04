package com.sanjeev.citrixx.executors;

import java.util.ArrayList;
import java.util.List;

public class StaticVehicleData {

    private static List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        new Vehicle("VIN", "Ford", "Mustang", "2015");

        vehicles.add(new Vehicle("VIN111", "Ford", "Mustang", "2019"));
        vehicles.add(new Vehicle("VIN222", "Ford", "F-150", "2020"));

        return vehicles;
    }
}
