package com.seina.design.pattern.structural.facade.facadeDemo;

/**
 * @author Seina
 * @version 2018-11-30 22:48:54
 *
 * 外观类：需要了解所有的子系统的方法或属性，进行组合，以备外界进行使用
 */
public class Facade {

    SubSystemOne one;

    SubSystemTwo two;


    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }

    public void methodA(){
        System.out.println("方法组A");
        one.MethodOne();
        two.MethodTwo();
    }
    public void methodB(){
        System.out.println("方法组A");
        one.MethodOne();
    }
}
