package com.sai.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insert() {
        vehicleList.add("BMW");
        vehicleList.add("Audi");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.vehicleList) {
            temp.add(s);
        }
        return new Vehicle(temp);
    }

}
