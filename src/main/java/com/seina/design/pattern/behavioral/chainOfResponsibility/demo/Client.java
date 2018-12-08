package com.seina.design.pattern.behavioral.chainOfResponsibility.demo;

/**
 * @author Seina
 * @version 2018-12-08 18:15:42
 */
public class Client {

    public static void main(String[] args) {

        Handle concreteHandleA = new ConcreteHandleA();

        Handle concreteHandleB = new ConcreteHandleB();

        Handle concreteHandleC = new ConcreteHandleC();

        concreteHandleA.setHandle(concreteHandleB);

        concreteHandleB.setHandle(concreteHandleC);

        int[] requests = {1, 11, 21};

        for (int i : requests) {
            concreteHandleA.handleRequest(i);
        }
    }
}
