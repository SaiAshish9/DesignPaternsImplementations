package com.sai.designPatterns.factory;

import com.sai.designPatterns.factory.context.VehicleContext;
import com.sai.designPatterns.factory.enums.VehicleType;

public abstract class Vehicle<T extends VehicleContext> {
    public abstract int getWheel();
    public abstract VehicleType getType();
    public abstract void process(T context);

    public String toString() {
        return "Wheel: " + this.getWheel();
    }


}
