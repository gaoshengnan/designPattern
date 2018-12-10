package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 22:29:53
 *
 * 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }


}
