package com.seina.design.pattern.behavioral.observer.unCoupleOne;

/**
 * @author Seina
 * @version 2018-12-01 20:02:24
 */
public abstract class Observer {

    private String name;

    private SecretaryOne secretary;

    public Observer(String name, SecretaryOne secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    /**
     * 得到通知之后更新自己
     */
    public abstract void update();
}
