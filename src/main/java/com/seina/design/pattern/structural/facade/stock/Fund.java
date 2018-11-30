package com.seina.design.pattern.structural.facade.stock;

/**
 * @author Seina
 * @version 2018-11-30 22:09:19
 */
public class Fund {

    Stock1 stock1;

    Stock2 stock2;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
    }

    public void buyFund(){
        System.out.println("基金帮我处理如何买入股票1和股票2");
        stock1.Buy();
        stock2.Buy();
    }

    public void sellFund(){
        System.out.println("基金帮我处理如何卖出股票1和股票2");
        stock1.sell();
        stock2.sell();
    }


}
