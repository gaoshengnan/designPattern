package com.seina.design.pattern.structural.proxy.proxyDemo;

import com.seina.design.pattern.structural.proxy.pursuit.Fairy;

/**
 * @author Selina
 * @version 2018/11/26 21:29:33
 */
public class Client {

    public static void main(String[] args) {

        /**
         * seina不认识他的追求者，但却可以通过代理得到她的礼物
         */

        Fairy seina = new Fairy("seina");

        Proxy daili = new Proxy(seina);

        daili.giveChocolate();

        daili.giveDolls();



    }
}
