package com.seina.design.pattern.behavioral.chainOfResponsibility.demo;

/**
 * @author Seina
 * @version 2018-12-08 18:10:16
 */
public abstract class Handle {

    protected Handle handle;

    /**
     * 设置继承者
     */
    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    /**
     * 处理请求的抽象方法
     */
    public abstract void handleRequest(int request);
}
