package com.seina.design.pattern.behavioral.strategy.CashFactory;

/**
 * @author Selina
 * @version 2018/11/20 10:51:16
 * 抽象收银计算，包含计算总价方法
 */
public abstract class AbstractCash {

    public abstract double getTotal(double totalPrice);
}
