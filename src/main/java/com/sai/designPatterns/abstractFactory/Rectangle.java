package com.sai.designPatterns.abstractFactory;

import org.springframework.stereotype.Service;

@Service
public class Rectangle extends AbstractFactory {

    @Override
    protected void preProcess() {
        System.out.println(getType() + " :preProcess");
    }

    @Override
    protected void handleProcess() {
        System.out.println(getType() + " :handleProcess");
    }

    @Override
    protected void postProcess() {
        System.out.println(getType() + " :postProcess");
    }

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }
}
