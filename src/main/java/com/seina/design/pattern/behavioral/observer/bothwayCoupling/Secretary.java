package com.seina.design.pattern.behavioral.observer.bothwayCoupling;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-01 19:30:56
 *
 * 秘书类
 */
public class Secretary {


    /**
     * 维护观察者列表
     */
    private List<StockObserver> observers = new ArrayList<>();

    private String action;

    /**
     * 添加观察者
     */
    public void AddObserver(StockObserver stockObserver){
        observers.add(stockObserver);
    }

    /**
     * 通知观察者更新自己
     */
    public void notifying(){
        for (StockObserver stockObserver:observers) {
            stockObserver.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String name;

    public Secretary(String name) {
        this.name = name;
    }






}
