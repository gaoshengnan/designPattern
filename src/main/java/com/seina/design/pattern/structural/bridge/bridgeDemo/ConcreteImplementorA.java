package com.seina.design.pattern.structural.bridge.bridgeDemo;

/**
 * @author Seina
 * @version 2018-12-06 23:55:51
 */
public class ConcreteImplementorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
