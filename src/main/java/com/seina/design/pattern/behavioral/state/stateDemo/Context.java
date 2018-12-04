package com.seina.design.pattern.behavioral.state.stateDemo;

/**
 * @author Seina
 * @version 2018-12-04 21:09:34
 */
public class Context {

    private State state;

    /**
     * 可读写的状态属性，用于读取当前状态和设置新状态
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 定义Context的初始状态
     */
    public Context(State state) {

        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
