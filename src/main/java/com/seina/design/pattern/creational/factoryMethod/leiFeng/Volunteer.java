package com.seina.design.pattern.creational.factoryMethod.leiFeng;

/**
 * @author Selina
 * @version 2018/11/16 11:28:11
 * 志愿者类型的雷锋
 */
public class Volunteer extends LeiFeng {
    @Override
    public void Sweep() {
        System.out.println("是一个志愿者，同时也是雷锋，在帮助老人扫地");
    }

    @Override
    public void Wash() {
        System.out.println("是一个志愿者，同时也是雷锋，在帮助老人洗衣服");
    }
}
