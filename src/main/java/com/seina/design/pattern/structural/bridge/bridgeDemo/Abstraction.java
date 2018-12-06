package com.seina.design.pattern.structural.bridge.bridgeDemo;

/**
 * @author Seina
 * @version 2018-12-06 23:57:47
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void Operation();
}
