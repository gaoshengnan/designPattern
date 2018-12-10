package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 22:29:08
 *
 * 抽象中介者类
 */
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
