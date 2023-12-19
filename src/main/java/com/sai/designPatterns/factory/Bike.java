package com.sai.designPatterns.factory;

import com.sai.designPatterns.factory.context.BikeContext;
import com.sai.designPatterns.factory.enums.VehicleType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Bike extends Vehicle<BikeContext> {

    private static final VehicleType type = VehicleType.BIKE;
    private int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public VehicleType getType() {
        return type;
    }

    @Override
    public void process(BikeContext bikeContext) {
       log.info(type + " :process");
    }

}
