package com.seina.design.pattern.behavioral.templatemethod.demo;

/**
 * @author Selina
 * @version 2018/11/27 10:40:07
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B方法1具体实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类B方法2具体实现");
    }
}
