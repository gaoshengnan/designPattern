package com.seina.design.pattern.structural.proxy.pursuit;

/**
 * @author Selina
 * @version 2018/11/26 20:31:31
 *
 * 送礼物
 */
public class Client {


    public static void main(String[] args) {


        Fairy seina = new Fairy("seina");

        /**
         * 不使用代理
         * seina并不认识这个追求者，所以此段不符合实际
         */
        Pursuit pursuit = new Pursuit(seina);

        pursuit.giveChocolate();

        pursuit.giveDolls();

        /**
         * 使用代理
         * 把追求者换成代理类daili，也不合理，因为礼物是追求者准备的...
         */
        Proxy daili = new Proxy(seina);

        daili.giveChocolate();

        daili.giveDolls();

        //事实上，Pursuit（追求者）通过Proxy（代理）送给seina礼物才是合理的
        //因为Proxy送的礼物是Pursuit准备的，实质上是Pursuit送的

    }
}
