package com.sai.designPatterns;

import com.sai.designPatterns.abstractFactory.FactoryProvider;
import com.sai.designPatterns.prototype.spring.Car;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class Monitor {

    private final FactoryProvider factoryProvider;

    @PostConstruct
    public void process() {
//        AbstractFactory shapeFactory = FactoryProvider.create(false);
//        shapeFactory.getShape(ShapeType.SQUARE).process();

//        factoryProvider.getShape(ShapeType.RECTANGLE)
//        .process();
        Car car = new Car(Arrays.asList("BMW"));
        Car clonedCar = (Car) car.clone();
        System.out.println(clonedCar.getVehicleList());
    }

}
