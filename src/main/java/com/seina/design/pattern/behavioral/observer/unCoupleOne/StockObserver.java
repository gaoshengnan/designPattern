package com.seina.design.pattern.behavioral.observer.unCoupleOne;

/**
 * @author Seina
 * @version 2018-12-01 20:06:09
 */
public class StockObserver extends Observer {

    public StockObserver(String name, SecretaryOne secretary) {
        super(name, secretary);
    }

    @Override
    public void update() {
        System.out.println("关闭股票行情，继续工作");
    }
}
