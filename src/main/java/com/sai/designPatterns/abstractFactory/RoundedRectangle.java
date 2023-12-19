package com.sai.designPatterns.abstractFactory;

import org.springframework.stereotype.Service;

@Service
public class RoundedRectangle extends AbstractFactory {

    @Override
    public ShapeType getType() {
        return ShapeType.ROUNDED_RECTANGLE;
    }

    @Override
    protected void preProcess() {

    }

    @Override
    protected void handleProcess() {

    }

    @Override
    protected void postProcess() {

    }
}
