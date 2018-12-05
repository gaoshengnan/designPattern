package com.seina.design.pattern.behavioral.memento.mementoDemo;

/**
 * @author Seina
 * @version 2018-12-04 23:46:55
 */
public class Memento {

    private String state;

    /**
     * 构造方法，将相关数据倒入
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * 需要保存的数据属性，可以是多个
     */
    public String getState() {
        return state;
    }
}
