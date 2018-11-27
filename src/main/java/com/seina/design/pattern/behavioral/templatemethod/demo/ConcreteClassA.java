package com.seina.design.pattern.behavioral.templatemethod.demo;

/**
 * @author Selina
 * @version 2018/11/27 10:39:13
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A方法1具体实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A方法2具体实现");
    }
}
