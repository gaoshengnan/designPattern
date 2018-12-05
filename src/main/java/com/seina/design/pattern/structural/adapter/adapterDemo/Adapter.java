package com.seina.design.pattern.structural.adapter.adapterDemo;

/**
 * @author Seina
 * @version 2018-12-05 22:15:07
 *
 * 适配器
 */
public class Adapter extends Target{

    /**
     * 建立一个私有的Adaptee对象
     */
    private Adaptee adaptee = new Adaptee();


    /**
     * 这样可以把表面上调用的request()方法变成实际调用的specificRequest()
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
