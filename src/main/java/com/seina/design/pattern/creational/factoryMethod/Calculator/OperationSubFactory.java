package com.seina.design.pattern.creational.factoryMethod.Calculator;

import com.seina.design.pattern.creational.simpleFactory.Operation;
import com.seina.design.pattern.creational.simpleFactory.OperationSub;

/**
 * @author Selina
 * @version 2018/11/16 10:58:31
 * 加法运算操作生产工厂
 */
public class OperationSubFactory implements IOperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
