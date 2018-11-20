package com.seina.design.pattern.behavioral.strategy.CashFactory;

/**
 * @author Selina
 * @version 2018/11/20 10:53:57
 */
public class RebateCash extends AbstractCash {

    private double rebatePercentage;
    //私有化构造器传入折扣比例,用于初始化的时候传入折扣的比例，例如0.8折、0.9折等
    public RebateCash(double rebatePercentage){
        this.rebatePercentage = rebatePercentage;
    }
    @Override
    public double getTotal(double totalPrice) {
        return totalPrice * rebatePercentage;
    }
}
