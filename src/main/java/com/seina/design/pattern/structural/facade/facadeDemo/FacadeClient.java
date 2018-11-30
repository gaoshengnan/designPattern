package com.seina.design.pattern.structural.facade.facadeDemo;

/**
 * @author Seina
 * @version 2018-11-30 22:51:54
 */
public class FacadeClient {


    public static void main(String[] args) {
        Facade facade = new Facade();

        /*
         * 由于facade的存在，客户端根本不需要知道其他三个子系统的存在
         */
        facade.methodA();
        facade.methodB();
    }
}
