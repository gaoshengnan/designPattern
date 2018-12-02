package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

/**
 * @author Seina
 * @version 2018-12-02 15:37:17
 *
 * 抽象的通知者
 */
public abstract class Subject {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    /**
     * 添加观察者
     */
    public abstract void add(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifying();
}
