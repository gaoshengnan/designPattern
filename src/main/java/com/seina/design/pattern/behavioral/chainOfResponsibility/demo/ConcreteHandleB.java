package com.seina.design.pattern.behavioral.chainOfResponsibility.demo;

/**
 * @author Seina
 * @version 2018-12-08 18:11:54
 */
public class ConcreteHandleB extends Handle {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandleB处理了请求");
        } else if (handle != null){ //转移到下一位
            handle.handleRequest(request);
        }
    }
}
