package com.seina.pattern.creational.SimpleFactory;


/**
 * @author Selina
 * @version 2018/11/15 22:52:57
 * 加法类，继承运算类
 */
public class OperationAdd extends Operation {


    //继承抽象类时，子类必须重写父类的抽象方法
    @Override
    public String getResult(String numA, String numB) {
        String result = String.valueOf(Integer.parseInt(numA) + Integer.parseInt(numB));
        return result;
    }
}
