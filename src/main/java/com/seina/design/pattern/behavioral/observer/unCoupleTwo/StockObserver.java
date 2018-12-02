package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

/**
 * @author Seina
 * @version 2018-12-02 16:05:58
 */
public class StockObserver extends Observer {


    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println("关闭股票行情，继续工作");
    }
}
