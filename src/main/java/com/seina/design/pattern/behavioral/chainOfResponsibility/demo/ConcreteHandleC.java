package com.seina.design.pattern.behavioral.chainOfResponsibility.demo;

/**
 * @author Seina
 * @version 2018-12-08 18:11:54
 */
public class ConcreteHandleC extends Handle {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandleC处理了请求");
        } else if (handle != null){ //转移到下一位
            handle.handleRequest(request);
        }
    }
}
