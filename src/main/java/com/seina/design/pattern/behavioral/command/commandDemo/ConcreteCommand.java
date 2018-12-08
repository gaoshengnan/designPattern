package com.seina.design.pattern.behavioral.command.commandDemo;

/**
 * @author Seina
 * @version 2018-12-08 15:56:48
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
