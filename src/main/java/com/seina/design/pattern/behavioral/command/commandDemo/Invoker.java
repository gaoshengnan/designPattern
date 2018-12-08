package com.seina.design.pattern.behavioral.command.commandDemo;

/**
 * @author Seina
 * @version 2018-12-08 15:58:06
 *
 *
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 要求该命令执行这个请求
     */
    public void excuteCommand(){
        command.excute();
    }
}
