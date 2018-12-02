package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

/**
 * @author Seina
 * @version 2018-12-02 16:03:28
 */
public abstract class Observer {

    private String name;

    private Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    /**
     * 得到通知之后更新自己
     */
    public abstract void update();
}
