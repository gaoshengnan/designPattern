package com.seina.design.pattern.creational.simpleFactory;


/**
 * @author Selina
 * @version 2018/11/15 23:18:52
 * 减法类，继承运算类
 */
public class OperationSub extends Operation {

    @Override
    public String getResult(String numA, String numB) {
        String result = String.valueOf(Integer.parseInt(numA) - Integer.parseInt(numB));
        return result;
    }
}
