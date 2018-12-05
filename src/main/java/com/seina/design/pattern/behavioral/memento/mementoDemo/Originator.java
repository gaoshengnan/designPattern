package com.seina.design.pattern.behavioral.memento.mementoDemo;

/**
 * @author Seina
 * @version 2018-12-04 23:37:47
 */
public class Originator {

    private String state;

    /**
     * 创建备忘录，将需要保存的信息倒入并实例化出一个Memento对象
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 恢复备忘录，将Memento倒入并将相关数据恢复
     */
    public void setMemento(Memento memento){
        state = memento.getState();
    }

    /**
     * 显示数据
     */
    public void show(){
        System.out.println("State=" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
