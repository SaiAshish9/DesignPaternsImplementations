package com.sai.designPatterns.factory;

public class VehicleFactory {

    public static Vehicle create(String type, int wheel) {

        switch (type) {
            case "bike":
                return new Bike(wheel);
            case "car":
                return new Car(wheel);
            default:
                System.out.println("invalid type");
        }

        return null;

    }

}
