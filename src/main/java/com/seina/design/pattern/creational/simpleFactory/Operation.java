package com.seina.design.pattern.creational.simpleFactory;

/**
 * @author Selina
 * @version 2018/11/15 22:49:29
 * 实例化没有任何意义的操作类改成一个抽象类（由于不明确是什么操作，所以实例化操作类没有意义）
 */
public abstract class Operation {
    //抽象方法其实就是没有被实现的虚方法
    public abstract String getResult(String numA, String numB);
}
