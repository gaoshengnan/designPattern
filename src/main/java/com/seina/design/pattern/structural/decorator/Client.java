package com.seina.design.pattern.structural.decorator;


/**
 * @author Seina
 * @version 2018/11/21 22:53:30
 */
public class Client {

    public static void main(String[] args) {
        Person seina = new Person("seina");

        seina.wearTShirt();
        seina.wearBigTrouser();
        seina.wearSnearkers();
        seina.show();

        seina.wearSuit();
        seina.wearLeatherShoes();
        seina.show();
    }
}
