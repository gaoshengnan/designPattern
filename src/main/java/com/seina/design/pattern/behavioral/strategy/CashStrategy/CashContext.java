package com.seina.design.pattern.behavioral.strategy.CashStrategy;

import com.seina.design.pattern.behavioral.strategy.CashFactory.AbstractCash;

/**
 * @author Selina
 * @version 2018/11/20 12:06:10
 */
public class CashContext {

    AbstractCash abstractCash;

    //初始化时指定那种收银方式
    public CashContext(AbstractCash abstractCash){
        this.abstractCash = abstractCash;
    }

    public double callCash(double totalPrice){
        return abstractCash.getTotal(totalPrice);
    }
}
