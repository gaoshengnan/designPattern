package com.seina.design.pattern.structural.decorator;

/**
 * @author Selina
 * @version 2018/11/21 23:34:37
 * ConcreteDecoratorA就是具体的装饰对象，通过继承起到给Component，起到给Component添加职责的功能
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "new State";
        System.out.println("具有装饰对象A的操作");
    }
}
