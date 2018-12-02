package com.seina.design.pattern.behavioral.observer.unCoupleTwo;

/**
 * @author Seina
 * @version 2018-12-02 16:07:09
 */
public class MBAObserver extends Observer {

    public MBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println("关闭MBA网上直播，继续工作");
    }
}
