package com.seina.design.pattern.behavioral.command.barbecue;

/**
 * @author Seina
 * @version 2018-12-08 15:16:30
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    /**
     * 构造命令的时候需要指出谁来执行命令
     */
    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void excuteCommand();


}
