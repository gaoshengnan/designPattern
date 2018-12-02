package com.seina.design.pattern.behavioral.observer.unCoupleOne;

/**
 * @author Seina
 * @version 2018-12-01 20:07:20
 */
public class MBAObserver extends Observer {

    public MBAObserver(String name, SecretaryOne secretary) {
        super(name, secretary);
    }

    @Override
    public void update() {
        System.out.println("关闭MBA网上直播，继续工作");
    }
}
