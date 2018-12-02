package com.seina.design.pattern.behavioral.observer.bothwayCoupling;

/**
 * @author Seina
 * @version 2018-12-01 19:34:25
 */
public class StockObserver {


    private String name;

    private Secretary secretary;

    public void update(){
        System.out.println("关闭股票行情，继续工作");
    }

    public StockObserver(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }
}
