package com.seina.design.pattern.behavioral.command.commandDemo;

/**
 * @author Seina
 * @version 2018-12-08 16:04:51
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.setCommand(command);
        invoker.excuteCommand();
    }

}
