package com.sai.designPatterns.prototype;

public class PrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle v = new Vehicle();
        v.insert();
        Vehicle v1 = (Vehicle) v.clone();
        System.out.println(v1.getVehicleList());
    }

}
