package com.seina.design.pattern.behavioral.command.commandDemo;

/**
 * @author Seina
 * @version 2018-12-08 15:46:01
 *
 * 用来声明执行操作的抽象类
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void excute();
}
