package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

import com.seina.design.pattern.behavioral.observer.unCoupleTwo.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-02 15:51:03
 */
public class Secretary extends Subject {

    /**
     * 维护观察者列表
     */
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifying() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
