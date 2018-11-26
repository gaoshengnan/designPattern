package com.seina.design.pattern.structural.decorator;

/**
 * @author Selina
 * @version 2018/11/21 23:38:54
 */
public class ConcreteDecoratorB extends Decorator {

    private void AddedBehavior(){

    }

    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具有装饰对象B的操作");
    }
}
