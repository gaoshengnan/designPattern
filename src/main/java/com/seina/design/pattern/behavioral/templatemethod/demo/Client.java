package com.seina.design.pattern.behavioral.templatemethod.demo;

/**
 * @author Selina
 * @version 2018/11/27 10:40:45
 */
public class Client {

    public static void main(String[] args) {

        AbstractClass c;

        c= new ConcreteClassA();
        c.templateMethod();

        c= new ConcreteClassB();
        c.templateMethod();
    }
}
