package com.sai.designPatterns.abstractFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FactoryProvider {

    private Map<ShapeType, Shape> shapeProviders;

    @Autowired
    public FactoryProvider(List<Shape> shapeList) {
        shapeProviders = new HashMap<>();
        for (Shape shape : shapeList) {
            shapeProviders.put(shape.getType(), shape);
        }
    }

    public Shape getShape(ShapeType shapeType){
        return shapeProviders.get(shapeType);
    }

//    public static AbstractFactory create(boolean rounded) {
//        if (rounded) {
//            return new RoundedShapeFactory();
//        } else {
//            return new ShapeFactory();
//        }
//    }

}
