package com.seina.design.pattern.behavioral.command.barbecue;

/**
 * @author Seina
 * @version 2018-12-08 15:18:05
 *
 * 具体命令类
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    /**
     * 让烤肉串的人烤鸡翅
     */
    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }
}
