package com.seina.design.pattern.structural.bridge.bridgeDemo;

/**
 * @author Seina
 * @version 2018-12-07 00:00:33
 */
public class Client {

    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstract();

        ab.setImplementor(new ConcreteImplementorA());
        ab.Operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.Operation();
    }
}
