package com.seina.design.pattern.structural.bridge.bridgeDemo;

/**
 * @author Seina
 * @version 2018-12-06 23:59:34
 */
public class RefinedAbstract extends Abstraction {

    @Override
    public void Operation() {
        implementor.operation();
    }
}
