package com.seina.design.pattern.behavioral.command.barbecue;

import sun.awt.image.GifImageDecoder;

/**
 * @author Seina
 * @version 2018-12-08 15:37:34
 */
public class Client {

    public static void main(String[] args) {

        Barbecuer barbecuer = new Barbecuer();

        Command bakeMutton = new BakeMuttonCommand(barbecuer);

        Command bakeChicken = new BakeChickWingCommand(barbecuer);

        Waiter waiter = new Waiter();


        waiter.setOrders(bakeMutton);

        waiter.setOrders(bakeChicken);

        waiter.setOrders(bakeMutton);

        waiter.cancelOrder(bakeChicken);

        waiter.notifying();
    }
}
