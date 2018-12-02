package com.seina.design.pattern.behavioral.observer.unCoupleOne;

import com.seina.design.pattern.behavioral.observer.bothwayCoupling.Secretary;

/**
 * @author Seina
 * @version 2018-12-01 20:37:26
 */
public class Client {

    public static void main(String[] args) {

        SecretaryOne seina = new SecretaryOne();

        StockObserver mh = new StockObserver("观察者股民--马户", seina);

        MBAObserver wxb = new MBAObserver("观察者MBA网上直播--王小波", seina);

        seina.addOberver(mh);
        seina.addOberver(wxb);

        seina.setAction("老板来了");

        seina.notifying();
    }



}
