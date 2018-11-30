package com.seina.design.pattern.structural.facade.stock;

/**
 * @author Seina
 * @version 2018-11-30 21:54:43
 */
public class PersonlClient {


    public static void main(String[] args) {

        User seina = new User("seina");

        Stock1 stock1 = new Stock1();

        Stock2 stock2 = new Stock2();

        System.out.println("我是" + seina.getName());
        System.out.println("我将" + stock1.Buy() + "，又将" + stock2.Buy());
        System.out.println("买了一堆之后，看到股票大跌");
        System.out.println("我将" + stock1.sell() + "，又将" + stock2.sell());

        System.out.println("鉴于我不了解股票的各种信息，又不了解行情，不止如何买入，该买哪个，更不值何时该卖");


        /**
         * 所以我需要了解股票，国债，等情况，需要参与这些项目的具体买和卖，但这耦合性太高
         */

    }
}
