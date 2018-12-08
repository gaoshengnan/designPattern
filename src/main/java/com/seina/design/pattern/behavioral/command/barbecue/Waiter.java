package com.seina.design.pattern.behavioral.command.barbecue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-08 15:26:28
 */
public class Waiter {

    /**
     * 维护一个订单列表
     */
    private List<Command> orders = new ArrayList<>();

    /**
     * 设置订单/新增订单
     */
    public void setOrders(Command command) {
        if (command instanceof BakeChickWingCommand){
            System.out.println("鸡翅没有，请点其他的烧烤");
        } else {
            orders.add(command);
        }
    }

    /**
     * 取消订单
     */
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消"+ command.toString()+ LocalDateTime.now());
    }

    public void notifying(){
        for (Command command : orders) {
            command.excuteCommand();
        }
    }
}
