package com.seina.design.pattern.creational.factoryMethod.leiFeng;

/**
 * @author Selina
 * @version 2018/11/16 11:31:09
 */
public class VolLeiFengFactory implements ILeiFengFactory {
    @Override
    public LeiFeng createLeiFactory() {
        return new Volunteer();
    }
}
