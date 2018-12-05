package com.seina.design.pattern.behavioral.memento.mementoDemo;

/**
 * @author Seina
 * @version 2018-12-05 08:17:11
 */
public class Caretaker {

    private Memento memento;

    /**
     * 得到或设置备忘录
     */
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
