package com.seina.design.pattern.creational.factoryMethod.leiFeng;

/**
 * @author Selina
 * @version 2018/11/16 11:30:49
 */
public class UndLeiFengFactory implements ILeiFengFactory {

    @Override
    public LeiFeng createLeiFactory() {
        return new Undergraduate();
    }
}
