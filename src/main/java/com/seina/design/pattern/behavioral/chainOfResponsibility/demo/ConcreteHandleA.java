package com.seina.design.pattern.behavioral.chainOfResponsibility.demo;

/**
 * @author Seina
 * @version 2018-12-08 18:11:54
 */
public class ConcreteHandleA extends Handle {


    /**
     * 如果符合条件，那就自己处理
     *
     * 如果不符合，就设置下一位处理的人，让他处理，以此链路走下去
     */
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandleA处理了请求");
        } else if (handle != null){
            handle.handleRequest(request);
        }
    }
}
