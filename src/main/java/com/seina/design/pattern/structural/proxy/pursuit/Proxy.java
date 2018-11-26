package com.seina.design.pattern.structural.proxy.pursuit;

/**
 * @author Selina
 * @version 2018/11/26 20:54:09
 * 代理类
 */
public class Proxy {

    Fairy mm = null;

    //声明一个追求某个学妹的追求者
    Proxy(Fairy mm) {
        this.mm = mm;
    }

    void giveDolls(){
        System.out.println("送"+mm.getName()+"洋娃娃");
    }

    void giveChocolate(){
        System.out.println("送"+mm.getName()+"巧克力");
    }

}
