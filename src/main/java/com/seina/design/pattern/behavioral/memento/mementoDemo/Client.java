package com.seina.design.pattern.behavioral.memento.mementoDemo;

/**
 * @author Seina
 * @version 2018-12-05 08:18:37
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();

        /**
         * Originator初始状态，状态属性为"On"
         */
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");

        o.show();

        o.setMemento(c.getMemento());
        o.show();


    }
}
