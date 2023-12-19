package com.sai.designPatterns.factory;

import com.sai.designPatterns.factory.context.CarContext;
import com.sai.designPatterns.factory.enums.VehicleType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Car extends Vehicle<CarContext> {

    private static final VehicleType type = VehicleType.CAR;
    private int wheel;

    public Car(int wheel) {
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
    public void process(CarContext context) {
       log.info(type + " :process");
    }
}
