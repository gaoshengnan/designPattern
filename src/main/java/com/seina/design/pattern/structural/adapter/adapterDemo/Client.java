package com.seina.design.pattern.structural.adapter.adapterDemo;

/**
 * @author Seina
 * @version 2018-12-05 22:19:02
 */
public class Client {


    public static void main(String[] args) {

        /**
         * 对客户端来说，调的就是Target的request()
         */
        Target target = new Adapter();
        target.request();
    }
}
