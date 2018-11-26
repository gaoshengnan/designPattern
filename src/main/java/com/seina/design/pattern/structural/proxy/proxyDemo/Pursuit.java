package com.seina.design.pattern.structural.proxy.proxyDemo;

import com.seina.design.pattern.structural.proxy.pursuit.Fairy;

/**
 * @author Selina
 * @version 2018/11/26 21:23:14
 */
public class Pursuit implements IGiveGift {

    Fairy mm = null;

    //声明一个追求某个学妹的追求者
    public Pursuit(Fairy mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("送"+mm.getName()+"洋娃娃");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送"+mm.getName()+"巧克力");
    }
}
