package com.seina.design.pattern.creational.factoryMethod.leiFeng;

/**
 * @author Selina
 * @version 2018/11/16 11:31:09
 * 生产大学生雷锋的工厂
 */
public class VolLeiFengFactory implements ILeiFengFactory {
    @Override
    public LeiFeng createLeiFactory() {
        return new Volunteer();
    }
}
