package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

/**
 * @author Seina
 * @version 2018-12-02 16:08:38
 */
public class Client {

    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver mh = new StockObserver("股票马户", boss);

        /**
         * 此时Boss这个通知这只通知了马户一个观察者
         */
        boss.setStatus("我是老板，我回来了");

        boss.add(mh);

        boss.notifying();


    }
}
