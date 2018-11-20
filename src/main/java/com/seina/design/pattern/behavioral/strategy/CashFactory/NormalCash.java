package com.seina.design.pattern.behavioral.strategy.CashFactory;

/**
 * @author Selina
 * @version 2018/11/20 10:53:45
 */
public class NormalCash extends AbstractCash {
    @Override
    public double getTotal(double totalPrice) {
        return totalPrice;
    }
}
