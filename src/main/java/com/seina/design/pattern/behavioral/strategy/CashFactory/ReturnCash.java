package com.seina.design.pattern.behavioral.strategy.CashFactory;

/**
 * @author Selina
 * @version 2018/11/20 10:54:10
 */
public class ReturnCash extends AbstractCash {

    private double moneyCondition;

    private double moneyReduce;

    //初始化时必须指定条件，比如满300减100，300是moneyCondition，100是moneyReduce
    public ReturnCash(double moneyCondition, double moneyReduce){
        this.moneyCondition = moneyCondition;
        this.moneyReduce = moneyReduce;
    }
    @Override
    public double getTotal(double totalPrice) {
        double result = totalPrice;
        if (totalPrice >= moneyCondition){
            result = totalPrice - moneyReduce;
        }
        return result;
    }
}
