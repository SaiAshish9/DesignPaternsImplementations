package com.sai.designPatterns.abstractFactory;

public abstract class AbstractFactory implements Shape {

    @Override
    public void process(){
       preProcess();
       handleProcess();
       postProcess();
    }

    abstract protected void preProcess();
    abstract protected void handleProcess();
    abstract protected void postProcess();

}
