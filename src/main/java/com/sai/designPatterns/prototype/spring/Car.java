package com.sai.designPatterns.prototype.spring;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Car extends AbstractVehicle {

    private List<String> vehicleList;

    @Override
    public AbstractVehicle clone() {
        return new Car(vehicleList);
    }
}
