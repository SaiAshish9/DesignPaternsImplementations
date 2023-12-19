package com.sai.designPatterns.abstractFactory;

import org.springframework.stereotype.Service;

@Service
public class Square extends AbstractFactory {

    @Override
    public void process() {
        System.out.println("Square");
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

    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }

}
