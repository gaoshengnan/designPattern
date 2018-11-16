package com.seina.design.pattern.creational.factoryMethod.Calculator;

import com.seina.design.pattern.creational.simpleFactory.Operation;

/**
 * @author Selina
 * @version 2018/11/16 10:53:21
 * 操作工厂接口
 * 根据依赖倒置原则，将简单工厂模式的工厂类抽象出一个接口
 * 这个接口只有一个方法，就是创建抽象产品（这里的抽象产品指抽象的运算操作，具体到加法操作，加法操作等）的工厂方法
 */
public interface IOperationFactory {
    Operation createOperation();
}
