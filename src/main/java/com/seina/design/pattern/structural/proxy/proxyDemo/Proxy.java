package com.seina.design.pattern.structural.proxy.proxyDemo;

import com.seina.design.pattern.structural.proxy.pursuit.Fairy;

/**
 * @author Selina
 * @version 2018/11/26 21:25:52
 */
public class Proxy implements IGiveGift {

    Pursuit pursuit = null;

    //在代理的构造器里也构造了一个追求者，为了让他去准备礼物-，-哈哈哈
    public Proxy(Fairy mm) {
        pursuit = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        //在实现中调用追求者的方式，实质上代理只是帮忙代送礼物，真正准备礼物的还是追求者
        pursuit.giveDolls();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
