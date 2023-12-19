package com.sai.designPatterns.abstractFactory;

import org.springframework.stereotype.Service;

@Service
public class RoundedSquare extends AbstractFactory {

    @Override
    public ShapeType getType() {
        return ShapeType.ROUNDED_SQUARE;
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
