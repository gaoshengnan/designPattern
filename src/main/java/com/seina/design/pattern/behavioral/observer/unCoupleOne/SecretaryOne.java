package com.seina.design.pattern.behavioral.observer.unCoupleOne;

import com.seina.design.pattern.behavioral.observer.bothwayCoupling.StockObserver;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-01 20:03:53
 */
public class SecretaryOne {


    /**
     * 维护观察者列表
     */
    private List<Observer> observers = new ArrayList<>();

    private String action;


    /**
     * 添加观察者
     *
     * Observer 针对抽象编程，较少了与具体类的耦合
     */
    public void addOberver(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void detachObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知观察者更新自己
     */
    public void notifying(){
        for (Observer observer:observers) {
            observer.update();
        }
    }

    public void setAction(String action) {
        this.action = action;
    }
}
