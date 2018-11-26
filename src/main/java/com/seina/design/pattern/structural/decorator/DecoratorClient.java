package com.seina.design.pattern.structural.decorator;

/**
 * @author Selina
 * @version 2018/11/21 23:40:42
 */
public class DecoratorClient {


    public static void main(String[] args) {

        //具体的Component对象
        ConcreteComponent c = new ConcreteComponent();

        //具体的装饰对象
        ConcreteDecoratorA dA = new ConcreteDecoratorA();
        ConcreteDecoratorB dB = new ConcreteDecoratorB();

        dA.setComponent(c);//实例对象dA来包装c
        dB.setComponent(c);

        dB.Operation();


    }

}
