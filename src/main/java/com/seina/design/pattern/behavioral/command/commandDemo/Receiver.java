package com.seina.design.pattern.behavioral.command.commandDemo;

/**
 * @author Seina
 * @version 2018-12-08 15:46:30
 */
public class Receiver {

    /**
     * 知道如何实施与执行一个与请求相关的具体的操作，任何类都可能作为一个接受者
     */
    public void action(){
        System.out.println("执行操作");
    }
}
