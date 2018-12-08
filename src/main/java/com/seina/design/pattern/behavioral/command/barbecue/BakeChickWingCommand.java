package com.seina.design.pattern.behavioral.command.barbecue;

/**
 * @author Seina
 * @version 2018-12-08 15:18:53
 *
 * 具体命令类
 */
public class BakeChickWingCommand extends Command {
    public BakeChickWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    /**
     * 让烤肉串的人烤羊肉串
     */
    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }
}
