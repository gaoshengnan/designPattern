package com.seina.design.pattern.structural.bridge.bridgeDemo;

/**
 * @author Seina
 * @version 2018-12-06 23:56:47
 */
public class ConcreteImplementorB extends Implementor {


    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
